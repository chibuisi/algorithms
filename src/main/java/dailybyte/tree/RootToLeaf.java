package dailybyte.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RootToLeaf {
    private static List<List<Integer>> result;
    public static List<List<Integer>> solve(TreeNode root){
        result = new ArrayList<>();
        rootToLeave(root, new LinkedList<Integer>());
        return result;
    }

    private static void rootToLeave(TreeNode node, LinkedList<Integer> list){
        if(node == null) {
            return;
        }
        list.addLast(node.value);
        if(node.left == null && node.right == null) {
           result.add(new ArrayList<>(list));
        }
        else {
            rootToLeave(node.left, list);
            rootToLeave(node.right, list);
        }
        list.removeLast();
    }

    //this solution is buggy
    public static List<List<Integer>> solve2(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        helper(root, result, new ArrayList<>());
        return result;
    }

    private static void helper(TreeNode node, List<List<Integer>> result, List<Integer> curr){
        if(node.left == null && node.right == null){
            curr.add(node.value);
            result.add(curr);
            return;
        }
        if(node.left != null) {
            curr.add(node.value);
            //List<Integer> newCurr = new ArrayList<>(curr);
            helper(node.left, result, new ArrayList<>(curr));
        }
        if(node.right != null) {
            curr.add(node.value);
            //List<Integer> newCurr = new ArrayList<>(curr);
            helper(node.right, result, new ArrayList<>(curr));
        }
    }

    public static List<String> rootToLeafPaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if(root == null) {
            return paths;
        }

        generatePaths(root, paths, "");
        return paths;
    }

    public static void generatePaths(TreeNode root, List<String> paths, String current) {
        if(root.left == null && root.right == null) {
            current += root.value;
            paths.add(current);
            return;
        }

        if(root.left != null) {
            generatePaths(root.left, paths, current + root.value + "->");
        }

        if(root.right != null) {
            generatePaths(root.right, paths, current + root.value + "->");
        }
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        GenerateTree.print(tree);
        System.out.println();
        System.out.println(solve(tree));
        System.out.println(solve2(tree));
        System.out.println(rootToLeafPaths(tree));
    }
}
