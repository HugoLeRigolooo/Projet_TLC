public class runtime {

        public static class Node{
            public Node nodeLeft;
            public Node nodeRight;
            
            public String val;

            public Node(Node nodeLeft, Node nodeRight ){
                this.nodeRight=nodeRight;
                this.nodeLeft=nodeLeft;
                this.val=null;
            }

            public Node(String val) {
                this.nodeRight = null;
                this.nodeLeft = null;
                this.val = val;
        }
        }
    
    public static boolean EstSymbole(Node n){
        return !(n.val==null);
    }

    public static Node symbole(String val) {
        return new Node(val);
    }

    public static Node hd(Node n) {
        if (n == null || EstSymbole(n)){
            return null;
        }
        return n.nodeLeft;
    }

    public static Node tl(Node n) {
        if (n == null || EstSymbole(n)){
            return null;}
        return n.nodeRight;
        }

   public static Node cons(Node... elements) { //Transforme les paramètres en tableau de Node
        // (cons) = nil
        if (elements.length == 0) {
            return null;
        }
        // (cons T) = T
        if (elements.length == 1) {
            return elements[0];
        }

        //(cons T1 T2 ... Tn) = (cons T1 (cons T2 ... (cons Tn-1 Tn)...)
        Node result = elements[elements.length - 1];
        for (int i = elements.length - 2; i >= 0; i--) {
            result = new Node(elements[i], result);
        }
        return result;
    }

    
    public static Node list(Node... elements) {

        if (elements.length == 0) {
            return null;
        }

        Node res = null;
        // (list T1 T2 ... Tn) = (cons T1 (cons T2 ... (cons Tn nil) ...))
        for (int i = elements.length - 1; i >= 0; i--) {
        res = cons(elements[i], res);
        }
        return res;
    }

}