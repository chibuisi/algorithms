package dailybyte.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SameLeaves {
    public static boolean solve(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        List<Integer> leftLeaves = leaves2(t1, new ArrayList<>());
        List<Integer> rightLeaves = leaves(t2);
        System.out.println(leftLeaves);
        System.out.println(rightLeaves);
        return leftLeaves.size() == rightLeaves.size() && leftLeaves.containsAll(rightLeaves);
    }

    private static List<Integer> leaves(TreeNode root){
        List<Integer> leaves = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left == null && node.right == null)
                leaves.add(node.value);
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
        return leaves;
    }

    private static List<Integer> leaves2(TreeNode root, List<Integer> leaves){
        if(root == null)
            return leaves;
        if(root.left == null && root.right == null)
            leaves.add(root.value);
        leaves2(root.left, leaves);
        leaves2(root.right, leaves);
        return leaves;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        System.out.println(solve(tree,tree));
    }
}
