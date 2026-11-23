import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

public class TableSymboles {

    public CommonTree ast;
    public WhileLexer lexer;
    public WhileParser parser;
    public List<InfoFonction> table;

    public TableSymboles(CommonTree ast, WhileLexer lexer, WhileParser parser){
        this.ast=ast;
        this.lexer=lexer;
        this.parser=parser;
    }
    public static class InfoFonction {
        public String nom;
        public List<String> entrees;
        public List<String> sorties;
        public Set<String> variablesLocales = new HashSet<>();
    
        public InfoFonction(String nom, List<String> entrees,  List<String> sorties) {
            this.nom = nom;
            if (entrees!=null){
                this.entrees =new ArrayList<>(entrees);
                variablesLocales.addAll(entrees);
            }
            else{
                this.entrees=new ArrayList<>();
            }
            if (sorties!=null){
                this.sorties =new ArrayList<>(sorties);
                variablesLocales.addAll(sorties);
            }
            else{
                this.sorties =new ArrayList<>();
            }

        }
        @Override
        public String toString() {
            return "Fonction " + nom
                    + "\n  Entrées : " + entrees
                    + "\n  Sorties : " + sorties
                    + "\n  Variables locales : " + variablesLocales;
        }
    }

    private Map<String, InfoFonction> fonctions = new HashMap<>();

    private void afficherNoeuds(CommonTree noeud, int profondeur) {
        if (noeud == null) return;

        int type = noeud.getType();
        String nomType = type >= 0 && type < WhileParser.tokenNames.length
                ? WhileParser.tokenNames[type]
                : "inconnu";

        String indentation = "  ".repeat(profondeur);
        System.out.println(indentation + "Token: " + noeud.getText()
                + " | Type: " + nomType + " (" + type + ")");

        for (int i = 0; i < noeud.getChildCount(); i++) {
            afficherNoeuds((CommonTree) noeud.getChild(i), profondeur + 1);
        }
    }

    public void parcourtProfondeurArbre(CommonTree arbre) {
        afficherNoeuds(arbre, 0);
    }

    public List<InfoFonction> parcourtPasse1(CommonTree arbre) {
        List<InfoFonction> listInfoFonc = new ArrayList<>();
        for (int i=0; i<arbre.getChildCount(); i++){
            CommonTree ast_function = (CommonTree) arbre.getChild(i);
            switch (ast_function.getType()){
                case WhileParser.FUNCTION:
                    String name = ast_function.getChild(i).getText();
                    List<String> params = parcourtParamOutput((CommonTree) ast_function.getChild(1));
                    List<String> output = parcourtParamOutput((CommonTree) ast_function.getChild(3));
                    listInfoFonc.add(new InfoFonction(name, params, output));
            }
        }   
        return listInfoFonc;
    }


    public List<String> parcourtParamOutput(CommonTree arbre){
        List<String> list = new ArrayList<>();

        for (int i=0; i<arbre.getChildCount(); i++){
            list.add(arbre.getChild(i).getText());
        }
        return list;
    }

}