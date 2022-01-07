package dailybyte.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinDifference {
    public static int solve(TreeNode root){
        if(root == null)
            return -1;
        if(root.left == null && root.right == null)
            return root.value;
        int min = Integer.MAX_VALUE;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.remove();
            if(node.left != null){
                min = Integer.min(min, Math.abs(node.value - node.left.value));
                nodeQueue.add(node.left);
            }
            if(node.right != null){
                min = Integer.min(min, Math.abs(node.value - node.right.value));
                nodeQueue.add(node.right);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        TreeNode tree2 = GenerateTree.create(new int[]{2,100,99});
        TreeNode tree3 = GenerateTree.create(new int[]{1,17,29,42,50,59});
        System.out.println(solve(tree3));

    }
}
