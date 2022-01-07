package apple.trees;

public class InvertBinaryTree {
    public static void main(String[] args) {

    }
    public static void invert(Tree tree){
        if(tree == null)
            return;
        swapLeftAndRight(tree.left, tree.right);
        invert(tree.left);
        invert(tree.right);
    }

    private static void swapLeftAndRight(Tree left, Tree right) {
        Tree tree = left;
        left = right;
        right = tree;
    }
}
