abstract class BT {

    // abstract method
    public abstract int height();

    //
    public abstract boolean isBST();

    public static Node buildBST(int[] values) {
        BT tree = Nil.getNil();
        for (int v : values) {
            tree = insertHelper(tree, v);
        }
        return (Node) tree;
    }

    //Helper Function
    private static BT insertHelper(BT tree, int value) {
        //if tree empty then create a new node
        if(tree instanceof Nil){
            return new Node(value, Nil.getNil(), Nil.getNil());
        }
        Node n = (Node) tree;
        if (value < n.num) {
            return new Node(n.num, insertHelper(n.left, value), n.right);
        } else {
            return new Node(n.num, n.left, insertHelper(n.right, value));
        }
    }

    // Recursive helper for Delete
    private static BT deleteHelper(BT tree, int key) {
    //  Here //

    }


   // Finding MAX key in NON-empty BST
    private static int findMax(Node root) {
        if (root.right instanceof Nil) {
            return root.num;
        }
        return findMax((Node) root.right);
    }



}
