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

    @Override
    public boolean isBST() {
        return isBSTHelper(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    @Override
    protected boolean isBSTHelper(int min, int max) {
        // Check current node value within valid range
        if (num < min || num > max) {
            return false;
        }

        // Check left subtree within updated range
        // and right subtree within updated range
        return left.isBSTHelper(min, num - 1)
                && right.isBSTHelper(num + 1, max);
    }

    @Override
    public BT delete(int key) {
        return super.delete(key);
    }

}
