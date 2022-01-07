package dailybyte.tree;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateTree {
    public static TreeNode create(int [] num){
        if(num.length == 0) return null;
        return helper(num, 0, num.length-1);
    }
    private static TreeNode helper(int [] nums, int start, int end){
        if(start > end) return null;
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid-1);
        node.right = helper(nums, mid+1, end);
        return node;
    }
    public static TreeNode get(){
        TreeNode one = new TreeNode(1);
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3);

        three.left = one;
        three.right = four;

        TreeNode eight = new TreeNode(8);
        TreeNode six = new TreeNode(6);
        TreeNode nine = new TreeNode(9);

        eight.left = six;
        eight.right = nine;

        return three;
    }

    public static void print(TreeNode tree){
        if(tree == null) return;
        print(tree.left);
        System.out.print(tree.value + "--->");
        print(tree.right);
    }

    public static void inOrder(TreeNode tree){
        if(tree == null) return;
        print(tree.left);
        System.out.print(tree.value + "--->");
        print(tree.right);
    }

    public static void preOrder(TreeNode tree){
        if(tree == null) return;
        System.out.println(tree.value);
        preOrder(tree.left);
        preOrder(tree.right);
    }

    public static void postOrder(TreeNode tree){
        if(tree == null) return;
        postOrder(tree.left);
        postOrder(tree.right);
        System.out.println(tree.value);
    }

    public static void printLevelOrder(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.print(node.value+"--->");
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
    }
}
