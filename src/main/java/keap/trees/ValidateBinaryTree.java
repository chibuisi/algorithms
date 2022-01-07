package keap.trees;

public class ValidateBinaryTree {
    public static boolean isValid(BinaryTree tree){
        if(tree == null)
            return true;
        return isValid(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValid(BinaryTree tree, int min, int max){
        if(tree.value < min || tree.value > max)
            return false;
        if(tree.left != null && !isValid(tree.left, min, tree.value))
            return false;
        if(tree.right != null && !isValid(tree.right, tree.value, max))
            return false;
        return true;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(4);
        BinaryTree left = new BinaryTree(1);
        BinaryTree right = new BinaryTree(5);
        tree.left = left;
        tree.right = right;
        System.out.println(isValid(tree));
    }
}
