import org.antlr.runtime.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        String inputFile = args.length > 0 ? args[0] : "Frontend/__Test___input.txt";
        WhileLexer lex = new WhileLexer(new ANTLRFileStream(inputFile, "UTF-8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        WhileParser parser = new WhileParser(tokens);
        parser.program();
    }
}