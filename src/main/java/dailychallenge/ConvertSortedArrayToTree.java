package dailychallenge;

import dailybyte.tree.GenerateTree;
import dailybyte.tree.TreeNode;

public class ConvertSortedArrayToTree {
    public static TreeNode solve(int [] num){
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

    public static void main(String[] args) {
        int [] arr = {3,9,12,32,35,44,59,60,300};
        TreeNode tree = solve(arr);
        GenerateTree.print(tree);
        System.out.println();
        GenerateTree.printLevelOrder(tree);
    }
}
