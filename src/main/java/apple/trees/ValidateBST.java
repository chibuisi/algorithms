package apple.trees;

import java.util.Arrays;

public class ValidateBST {
    public static void main(String[] args) {
        int [] nums = {3,6,45,21,23,43,4,56,72,34};
        //Arrays.sort(nums);
        BST tree = BST.constructMinHeightBST(nums);
        System.out.println(validateBST(tree));
        BST.print(tree);
    }
    public static boolean validateBST(BST tree){
        return isValid(tree, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private static boolean isValid(BST tree, int minValue, int maxValue) {
        if(minValue > maxValue)
            return false;
        if(tree.left != null && !isValid(tree.left, maxValue, tree.value))
            return false;
        if(tree.right != null && !isValid(tree.right, tree.value, maxValue))
            return false;
        return true;
    }
}
