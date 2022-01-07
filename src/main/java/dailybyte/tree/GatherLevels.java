package dailybyte.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GatherLevels {
    public static List<List<Integer>> solve(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int level = 1;
        int levelCount = 1;
        List<Integer> list = new ArrayList<>();
        list.add(root.value);
        while(!nodeQueue.isEmpty()){
            if(nodeQueue.size() == levelCount || (nodeQueue.size()==1 && levelCount>2)){
                if(!list.isEmpty())
                    result.add(list);
                list = new ArrayList<>();
                levelCount = (int) Math.pow(2, level++);
            }
            TreeNode node = nodeQueue.remove();

            if(node.left != null) {
                nodeQueue.add(node.left);
                list.add(node.left.value);
            }
            if(node.right != null) {
                nodeQueue.add(node.right);
                list.add(node.right.value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        TreeNode tree2 = GenerateTree.create(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
        GenerateTree.print(tree2);
        System.out.println();
        System.out.println(solve2(tree2));
        System.out.println(solve(tree2));
        System.out.println(lastLevelSUm(tree2));
        System.out.println(levelSum(tree2));
        System.out.println(leafNodes(tree2, new ArrayList<>()));
    }

    public static List<List<Integer>> solve2(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = nodeQueue.size();;
            for(int i = 0; i < size; i++){
                TreeNode node = nodeQueue.remove();
                list.add(node.value);
                if(node.left != null)
                    nodeQueue.add(node.left);
                if(node.right != null )
                    nodeQueue.add(node.right);
            }
            result.add(list);
        }
        return result;
    }

    public static int lastLevelSUm(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int levelSum = 0;
        while(!nodeQueue.isEmpty()){
            levelSum = 0;
            int size = nodeQueue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = nodeQueue.remove();
                levelSum += node.value;
                if(node.left != null)
                    nodeQueue.add(node.left);
                if(node.right != null)
                    nodeQueue.add(node.right);
            }
        }
        return levelSum;
    }

    public static List<Integer> levelSum(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int levelSum = 0;
        while (!nodeQueue.isEmpty()) {
            levelSum = 0;
            int size = nodeQueue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = nodeQueue.remove();
                levelSum += node.value;
                if(node.left != null)
                    nodeQueue.add(node.left);
                if(node.right != null)
                    nodeQueue.add(node.right);
            }
            result.add(levelSum);
        }
        return result;
    }

    public static List<Integer> leafNodes(TreeNode root, List<Integer> leaves){
        if(root == null)
            return leaves;
        if(root.left == null && root.right == null)
            leaves.add(root.value);
        leafNodes(root.left, leaves);
        leafNodes(root.right, leaves);

        return leaves;
    }
}
