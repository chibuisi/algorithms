package dailybyte.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxValueInLevel {
    public static List<Integer> solve(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        int largest = Integer.MIN_VALUE;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()){
            int size = nodeQueue.size();
            largest = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode node = nodeQueue.remove();
                largest = Integer.max(largest, node.value);
                if(node.left != null)
                    nodeQueue.add(node.left);
                if(node.right != null)
                    nodeQueue.add(node.right);
            }
            result.add(largest);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        TreeNode tree2 = GenerateTree.create(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
        GenerateTree.print(tree);
        System.out.println();
        GenerateTree.print(tree2);
        System.out.println();
        System.out.println(solve(tree));
        System.out.println(solve(tree2));
    }
}
