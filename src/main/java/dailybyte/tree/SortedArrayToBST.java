package dailybyte.tree;

public class SortedArrayToBST {
    public static TreeNode solve(int [] nums){
        if(nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length-1);
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
        TreeNode tree = solve(new int[]{3,7,34,556,3432,4564,7689});
        GenerateTree.print(tree);
    }
}
