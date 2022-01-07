package dailybyte.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FindTheMode {
    public static int solve(TreeNode root){
        if(root == null) return -1;
        if(root.left == null && root.right == null) return root.value;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        Map<Integer, Integer> counts = new HashMap<>();
        int maxCount = 0;
        int maxKey = 0;
        while(!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.remove();
            counts.put(node.value, counts.getOrDefault(node.value,0)+1);
            if(maxCount < counts.get(node.value)){
                maxCount = counts.get(node.value);
                maxKey = node.value;
            }
            if(maxCount == counts.get(node.value))
                maxKey = Integer.min(maxKey, node.value);
            if(node.left != null)
                nodeQueue.add(node.left);
            if(node.right != null)
                nodeQueue.add(node.right);
        }
        return maxKey;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.create(new int[]{1,9,9,1,2,2,2,1,2});
        System.out.println(solve(tree));
    }
}
