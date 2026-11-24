import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;

public class CodeGenerator3A {
    private List<Instruction3A> code = new ArrayList<>();
    private int tempCount = 0;
    private int labelCount = 0;

    private String newTemp() {
        return "t" + (tempCount++);
    }

    private String newLabel() {
        return "L" + (labelCount++);
    }

    public List<Instruction3A> generer(CommonTree ast) {
        traduireNoeud(ast);
        return code;
    }

    private void traduireNoeud(CommonTree node) {
        switch (node.getType()) {
            case WhileParser.PROGRAM:
            case WhileParser.COMMANDS:
                for (int i = 0; i < node.getChildCount(); i++) {
                    traduireNoeud((CommonTree) node.getChild(i));
                }
                break;

            case WhileParser.FUNCTION:
                String funcName = node.getChild(0).getText();
                code.add(new Instruction3A("FUNC_BEGIN", null, null, funcName));
                // child(1) = INPUTS, child(2) = COMMANDS, child(3) = OUTPUTS
                traduireNoeud((CommonTree) node.getChild(2));
                CommonTree outputs = (CommonTree) node.getChild(3);
                for (int i = 0; i < outputs.getChildCount(); i++) {
                    code.add(new Instruction3A("RETURN", outputs.getChild(i).getText(), null, null));
                }
                code.add(new Instruction3A("FUNC_END", null, null, funcName));
                break;

            case WhileParser.NOP:
                break;

            case WhileParser.ASSIGN:
                CommonTree vars = (CommonTree) node.getChild(0);
                CommonTree exprs = (CommonTree) node.getChild(1);

                if (exprs.getChildCount() == 1
                        && exprs.getChild(0).getType() == WhileParser.CALL
                        && vars.getChildCount() > 1) {
                    CommonTree callNode = (CommonTree) exprs.getChild(0);
                    String calledFunc = callNode.getChild(0).getText();
                    int nbArgs = callNode.getChildCount() - 1;

                    List<String> argTemps = new ArrayList<>();
                    for (int i = 1; i <= nbArgs; i++) {
                        argTemps.add(traduireExpression((CommonTree) callNode.getChild(i)));
                    }
                    for (String arg : argTemps) {
                        code.add(new Instruction3A("PARAM", arg, null, null));
                    }
                    code.add(new Instruction3A("CALL", calledFunc, String.valueOf(nbArgs), null));

                    for (int i = 0; i < vars.getChildCount(); i++) {
                        code.add(new Instruction3A("POP_RET", null, null, vars.getChild(i).getText()));
                    }
                } else {
                    List<String> temps = new ArrayList<>();
                    for (int i = 0; i < exprs.getChildCount(); i++) {
                        temps.add(traduireExpression((CommonTree) exprs.getChild(i)));
                    }
                    for (int i = 0; i < vars.getChildCount(); i++) {
                        String varName = vars.getChild(i).getText();
                        code.add(new Instruction3A("COPY", temps.get(i), null, varName));
                    }
                }
                break;

            case WhileParser.IF:
                String condTemp = traduireExpression((CommonTree) node.getChild(0));
                String labelElse = newLabel();
                String labelEnd = newLabel();

                code.add(new Instruction3A("IF_FALSE", condTemp, null, labelElse));
                traduireNoeud((CommonTree) node.getChild(1)); // Bloc THEN
                code.add(new Instruction3A("GOTO", null, null, labelEnd));
                code.add(new Instruction3A("LABEL", null, null, labelElse));
                if (node.getChildCount() == 3) {
                    traduireNoeud((CommonTree) node.getChild(2)); // Bloc ELSE
                }
                code.add(new Instruction3A("LABEL", null, null, labelEnd));
                break;

            case WhileParser.WHILE:
                String labelDebutWhile = newLabel();
                String labelFinWhile = newLabel();

                code.add(new Instruction3A("LABEL", null, null, labelDebutWhile));
                String whileCond = traduireExpression((CommonTree) node.getChild(0));
                code.add(new Instruction3A("IF_FALSE", whileCond, null, labelFinWhile));
                traduireNoeud((CommonTree) node.getChild(1));
                code.add(new Instruction3A("GOTO", null, null, labelDebutWhile));
                code.add(new Instruction3A("LABEL", null, null, labelFinWhile));
                break;

            case WhileParser.FOR:
                String exprFor = traduireExpression((CommonTree) node.getChild(0));
                String compteur = newTemp();
                code.add(new Instruction3A("INT_VAL", exprFor, null, compteur));

                String labelDebutFor = newLabel();
                String labelFinFor = newLabel();

                code.add(new Instruction3A("LABEL", null, null, labelDebutFor));
                code.add(new Instruction3A("IF_FALSE", compteur, null, labelFinFor));
                traduireNoeud((CommonTree) node.getChild(1)); // Corps du FOR
                code.add(new Instruction3A("DEC", compteur, null, compteur));
                code.add(new Instruction3A("GOTO", null, null, labelDebutFor));
                code.add(new Instruction3A("LABEL", null, null, labelFinFor));
                break;

            case WhileParser.FOREACH:
                String varElem = node.getChild(0).getText();
                String exprList = traduireExpression((CommonTree) node.getChild(1));
                String curseur = newTemp();
                code.add(new Instruction3A("COPY", exprList, null, curseur));

                String labelDebutForeach = newLabel();
                String labelFinForeach = newLabel();

                code.add(new Instruction3A("LABEL", null, null, labelDebutForeach));
                code.add(new Instruction3A("IF_FALSE", curseur, null, labelFinForeach));
                code.add(new Instruction3A("HD", curseur, null, varElem));
                traduireNoeud((CommonTree) node.getChild(2)); // Corps du FOREACH
                code.add(new Instruction3A("TL", curseur, null, curseur));
                code.add(new Instruction3A("GOTO", null, null, labelDebutForeach));
                code.add(new Instruction3A("LABEL", null, null, labelFinForeach));
                break;
        }
    }

    private String traduireExpression(CommonTree expr) {
        switch (expr.getType()) {
            case WhileParser.NIL:
                String tNil = newTemp();
                code.add(new Instruction3A("NIL", null, null, tNil));
                return tNil;

            case WhileParser.VARIABLE:
                return expr.getText();

            case WhileParser.SYMBOL:
                String tSymb = newTemp();
                code.add(new Instruction3A("SYMB", expr.getText(), null, tSymb));
                return tSymb;

            case WhileParser.HD:
            case WhileParser.TL:
                String arg = traduireExpression((CommonTree) expr.getChild(0));
                String tRes = newTemp();
                String opName = (expr.getType() == WhileParser.HD) ? "HD" : "TL";
                code.add(new Instruction3A(opName, arg, null, tRes));
                return tRes;

            case WhileParser.EQUAL:
                String left = traduireExpression((CommonTree) expr.getChild(0));
                String right = traduireExpression((CommonTree) expr.getChild(1));
                String tEq = newTemp();
                code.add(new Instruction3A("EQUAL", left, right, tEq));
                return tEq;

            case WhileParser.CONS:
                int nCons = expr.getChildCount();
                if (nCons == 0) {
                    String tEmpty = newTemp();
                    code.add(new Instruction3A("NIL", null, null, tEmpty));
                    return tEmpty;
                }
                if (nCons == 1) {
                    return traduireExpression((CommonTree) expr.getChild(0));
                }
                String accCons = traduireExpression((CommonTree) expr.getChild(nCons - 1));
                for (int i = nCons - 2; i >= 0; i--) {
                    String elem = traduireExpression((CommonTree) expr.getChild(i));
                    String tCons = newTemp();
                    code.add(new Instruction3A("CONS", elem, accCons, tCons));
                    accCons = tCons;
                }
                return accCons;

            case WhileParser.LIST:
                String accList = newTemp();
                code.add(new Instruction3A("NIL", null, null, accList));
                for (int i = expr.getChildCount() - 1; i >= 0; i--) {
                    String elem = traduireExpression((CommonTree) expr.getChild(i));
                    String tCons = newTemp();
                    code.add(new Instruction3A("CONS", elem, accList, tCons));
                    accList = tCons;
                }
                return accList;

            case WhileParser.CALL:
                String calledFunc = expr.getChild(0).getText();
                int nbArgs = expr.getChildCount() - 1;

                List<String> argTemps = new ArrayList<>();
                for (int i = 1; i <= nbArgs; i++) {
                    argTemps.add(traduireExpression((CommonTree) expr.getChild(i)));
                }
                for (String tArg : argTemps) {
                    code.add(new Instruction3A("PARAM", tArg, null, null));
                }

                String tCallRes = newTemp();
                code.add(new Instruction3A("CALL", calledFunc, String.valueOf(nbArgs), tCallRes));
                return tCallRes;
        }
        return null;
    }
}