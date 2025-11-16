class Node extends BT {

    int num;   // value of the node
    BT left;   // reference to the left subtree
    BT right;  // reference to the right subtree

    // constructor for combining two existing binary trees
    Node(int n, BT l, BT r) {
        num = n;
        left = l;
        right = r;
    }

    // computing the height of the tree
    public int height() {
        int lh = left.height();
        int rh = right.height();
        return (lh < rh ? rh : lh) + 1;
    }
}
