public class Instruction3A {
    public String op;     // "CONS", "COPY", "GOTO", "IF_FALSE", "LABEL" etc...
    public String arg1;   // première operande (ou condition / nom de fonction)
    public String arg2;   // deuxième operande (ou null si unaire)
    public String result; // variable resultat (ou nom du label cible)

    public Instruction3A(String op, String arg1, String arg2, String result) {
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
    }

    @Override
    public String toString() {
        if ("FUNC_BEGIN".equals(op)) return "FUNC_BEGIN " + result + ":";
        if ("FUNC_END".equals(op))   return "FUNC_END " + result;
        if ("LABEL".equals(op))      return result + ":";
        if ("GOTO".equals(op))       return "  GOTO " + result;
        if ("IF_FALSE".equals(op))   return "  IF_FALSE " + arg1 + " GOTO " + result;
        if ("COPY".equals(op))       return "  " + result + " := " + arg1;
        if ("NIL".equals(op))        return "  " + result + " := NIL";
        if ("PARAM".equals(op))      return "  PARAM " + arg1;
        if ("RETURN".equals(op))     return "  RETURN " + arg1;
        if ("POP_RET".equals(op))    return "  " + result + " := POP_RET";
        if ("CALL".equals(op)) {
            if (result != null) return "  " + result + " := CALL " + arg1 + ", " + arg2;
            return "  CALL " + arg1 + ", " + arg2;
        }
        if (arg2 == null)            return "  " + result + " := " + op + " " + arg1;
        return "  " + result + " := " + op + " " + arg1 + ", " + arg2;
    }
}