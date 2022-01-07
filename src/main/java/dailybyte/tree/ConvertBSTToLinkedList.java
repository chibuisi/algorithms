package dailybyte.tree;

import java.util.LinkedList;
import java.util.List;

public class ConvertBSTToLinkedList {
    public static LinkedList<Integer> solve(TreeNode root){
        LinkedList<Integer> res = new LinkedList<>();
        if(root == null) return res;
        return helper(root, res);
    }
    private static LinkedList<Integer> helper(TreeNode tree, LinkedList<Integer> list){
        if(tree == null) return list;
        helper(tree.left, list);
        list.add(tree.value);
        helper(tree.right, list);
        return list;
    }

    public static LinkedList<Integer> preOrder(TreeNode tree, LinkedList<Integer> list){
        if(tree == null) return list;
        list.add(tree.value);
        preOrder(tree.left, list);
        preOrder(tree.right, list);
        return list;
    }

    public static LinkedList<Integer> postOrder(TreeNode tree, LinkedList<Integer> list){
        if(tree == null) return list;
        postOrder(tree.left, list);
        postOrder(tree.right, list);
        list.add(tree.value);
        return list;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        LinkedList<Integer> res = solve(tree);
        System.out.println(res);
        System.out.println(preOrder(tree, new LinkedList<>()));
        System.out.println(postOrder(tree, new LinkedList<>()));
    }
}
