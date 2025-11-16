class Node extends BT {

    int num;
    BT left;
    BT right;

    // constructor for combining 2 binary trees
    Node(int n, BT l, BT r) {
        num = n;
        left = l;
        right = r;
    }

    // computing the height
    public int height() {
        int lh = left.height();
        int rh = right.height();
        return (lh < rh ? rh : lh) + 1;
    }
    public String toString() {
        return "Node(" + num + ", " + left.toString() + ", " + right.toString() + ")";
    }

    public boolean isBST() {
        return isBSTInRange(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTInRange(int min, int max) {
        // Here
    }
}
