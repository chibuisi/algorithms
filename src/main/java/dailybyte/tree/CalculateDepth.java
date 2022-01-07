package dailybyte.tree;

public class CalculateDepth {
    public static int max;
    public static int solve(TreeNode root, int depth){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return depth+1;
        int left = solve(root.left, depth+1);
        int right = solve(root.right, depth+1);
        max = Math.max(max, Math.max(left,right));
        return max;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.create(new int[]{3,4,5,6,7,8,9});
        System.out.println(solve(tree, 0));
        System.out.println(GatherLevels.solve(tree));
    }
}
