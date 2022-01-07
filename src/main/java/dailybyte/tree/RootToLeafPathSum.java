package dailybyte.tree;

import java.util.Stack;

public class RootToLeafPathSum {
    public static boolean solve(TreeNode root, int target){
        if(root == null) return false;
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();
        nodeStack.push(root);
        integerStack.push(target-root.value);

        while(!nodeStack.isEmpty()){
            TreeNode node = nodeStack.pop();
            int remaining = integerStack.pop();

            if(node.left == null && node.right == null && remaining == 0)
                return true;
            if(node.left != null){
                nodeStack.push(node.left);
                integerStack.push(remaining-node.left.value);
            }
            if(node.right != null){
                nodeStack.push(node.right);
                integerStack.push(remaining-node.left.value);
            }
        }
        return false;
    }

    public static boolean solve2(TreeNode root, int target) {
        if (root == null) return false;
        return helper(root, target-root.value);
    }
    private static boolean helper(TreeNode node, int remaining){
        if(node.left == null && node.right == null && remaining == 0)
            return true;
        if(node.left != null)
            helper(node.left, remaining - node.left.value);
        if(node.right != null)
            helper(node.right, remaining - node.right.value);
        return false;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();GenerateTree.print(tree);
        System.out.println();
        System.out.println(solve2(tree, 4));
    }
}
