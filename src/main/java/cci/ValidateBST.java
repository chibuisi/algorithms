package cci;

public class ValidateBST {
    public static void main(String[] args) {

    }
    public static boolean validateBST(BST tree){
        return validateBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    static boolean validateBST(BST node, int min, int max){
        if(node.data < min || node.data > max)
            return false;
        if(node.left != null && !validateBST(node.left, min, node.data))
            return false;
        if(node.right != null && !validateBST(node.right, node.data, max))
            return false;
        return true;
    }
    static class BST{
        int data;
        BST left;
        BST right;

        BST(int data){
            this.data = data;
        }
    }
}
