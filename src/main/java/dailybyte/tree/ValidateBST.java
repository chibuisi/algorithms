package dailybyte.tree;

import keap.Tree;

public class ValidateBST {
    public static boolean solve(TreeNode root){
        if(root == null) return true;
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private static boolean isValid(TreeNode node, int min, int max){
        if(node.value < min || node.value > max)
            return false;
        if(node.left != null && !isValid(node.left, min, node.value))
            return false;
        if(node.right != null && !isValid(node.right, node.value, max))
            return false;
        return true;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        GenerateTree.print(tree);
        System.out.println(solve(tree));

        TreeNode zero = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        four.left = two;
        four.right = five;
        two.right = three;
        two.left = one;
        one.right = zero;

        System.out.println(solve(four));
    }
}
