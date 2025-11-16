abstract class BT {

    // abstract method
    public abstract int height();
    //
    public abstract boolean isBST();
    //helper method for range based BST checking
    protected abstract boolean isBSTHelper(int min, int max);
    // Public delete method
    public BT delete(int key) {
        return deleteHelper(this, key);
    }

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
    //if tree is empty then nothing to delete
        if(tree instanceof Nil){
            return tree;
        }
        Node n = (Node) tree;
        //if key is in left subtree
        if(key< n.num){
            return new Node(n.num, deleteHelper(n.left, key), n.right);
        }
        //if key is in the right subtree
        if(key > n.num){
            return new Node(n.num, n.left, deleteHelper(n.right, key));
        }
        //if node must be deleted and no children
        if (n.left instanceof Nil && n.right instanceof Nil) {
            return Nil.getNil();
        }
        // one child (right only)
        if (n.left instanceof Nil) {
            return n.right;
        }

        // one child (left only)
        if (n.right instanceof Nil) {
            return n.left;
        }

        // if two children then replace with max of left subtree
        int max = findMax((Node) n.left);
        return new Node(max, deleteHelper(n.left, max), n.right);

    }


   // Finding MAX key in NON-empty BST
    private static int findMax(Node root) {
        if (root.right instanceof Nil) {
            return root.num;
        }
        return findMax((Node) root.right);
    }
}
