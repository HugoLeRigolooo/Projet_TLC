public class prettyPrinter {
    
    public static String pp(runtime.Node t){
        if (runtime.estNil(t)){
            return "nil";
        }
        if (runtime.estSymbole(t)){
            return t.val;
        }

        runtime.Node filsGauche = runtime.hd(t);
        runtime.Node filsDroite = runtime.tl(t);

        if (runtime.estSymbole(filsGauche)){
            switch (filsGauche.val) {
                case "int":
                    return String.valueOf(evalInt(filsDroite));
                case "bool":
                    return String.valueOf(evalBoolean(filsDroite));
                case "string":
                    return evalString(filsDroite);
            }
        }
        return "(cons " + pp(filsGauche) + " " + pp(filsDroite)+")";
    }

    public static int evalInt (runtime.Node t){
        int res=0;
        if (runtime.estNil(t) || runtime.estSymbole(t)){
            return 0;
        }
        else{
            res++;
        }
        if(!runtime.estNil(runtime.tl(t))){
            res += evalInt(runtime.tl(t));
        }
        return res;
    }

    public static boolean evalBoolean(runtime.Node t){
        if (runtime.estNil(t) || runtime.estSymbole(t)){
            return false;
        }
        else{
            return true;
        }
    }

    public static String evalString(runtime.Node t){
        String res="";
        if (runtime.estNil(t)){
            return "";
        }
        if (runtime.estSymbole(t)){
            return t.val;
        }
        if(!runtime.estNil(runtime.hd(t))){
            res += evalString(runtime.hd(t));
        }
        if(!runtime.estNil(runtime.tl(t))){
            res += evalString(runtime.tl(t));
        }
        return res; 
    }
}
