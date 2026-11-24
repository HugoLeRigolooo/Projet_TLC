import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage : java Main <fichier.while>");
            System.exit(1);
        }

        try {
            String contenuSource = new String(Files.readAllBytes(Paths.get(args[0])), "UTF-8");
            System.out.println("Fichier de test : ");
            System.out.println(contenuSource);
            
            // lecture du fichier .while
            ANTLRFileStream input = new ANTLRFileStream(args[0], "UTF-8");

            // decoupage en tokens
            WhileLexer lexer = new WhileLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // analyse syntaxique et construction de l'AST
            WhileParser parser = new WhileParser(tokens);
            WhileParser.program_return result = parser.program();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Compilation interrompue : erreurs syntaxiques detectees.");
                System.exit(1);
            }

            // affichage de la racine de l'AST
            CommonTree ast = (CommonTree) result.getTree();

            CodeGenerator3A gen3A = new CodeGenerator3A();
            java.util.List<Instruction3A> code3A = gen3A.generer(ast);

            System.out.println("AST genere avec succes :");
            System.out.println(ast.toStringTree());

            System.out.println("\nCode 3 adresses genere :");
            for (Instruction3A inst : code3A) {
                System.out.println(inst);
            }

            TableSymboles t1 = new TableSymboles(ast,lexer,parser);
            t1.parcourtProfondeurArbre(t1.ast);
            System.out.println(t1.parcourtPasse1(ast));

        } catch (Exception e) {
            System.err.println("Erreur lors de l'analyse du fichier : " + e.getMessage());
            e.printStackTrace();
        }
    }
}

