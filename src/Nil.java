class Nil extends BT {

    private static Nil nil;

    // dummy constructor
    private Nil() {
    }

    // obtaining reference to the singleton
    public static Nil getNil() {
        if (nil == null) {
            nil = new Nil();
        }
        return nil;
    }

    // overriding method
    public int height() {
        return -1;
    }

    public boolean isBST() {
        return true;
    }

    public String toString() {
        return "Nil";
    }

}
