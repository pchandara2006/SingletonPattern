// We don't need this, just for
// checking
public class Main {
    public static void main(String[] args) {
        int[] vals = {3, 1, 4, 2};
        BT tree = BT.buildBST(vals);

        System.out.println("Tree:    " + tree);
        System.out.println("Height:  " + tree.height());
        System.out.println("isBST(): " + tree.isBST());
        System.out.println();

        int[] vals2 = {8, 5, 12, 11, 18, 17, 9, 10};
        BT tree2 = BT.buildBST(vals2);
        System.out.println("Original:            " + tree2);
        System.out.println("Original isBST():    " + tree2.isBST());
        System.out.println();

        tree2 = tree2.delete(10);
        System.out.println("After deleting 10:   " + tree2);
        System.out.println("isBST():             " + tree2.isBST());
        System.out.println();


        tree2 = tree2.delete(18);
        System.out.println("After deleting 18:   " + tree2);
        System.out.println("isBST():             " + tree2.isBST());
        System.out.println();

        tree2 = tree2.delete(8);
        System.out.println("After deleting 8:    " + tree2);
        System.out.println("isBST():             " + tree2.isBST());
    }

}
