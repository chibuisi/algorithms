package dailybyte.tree;

public class InvertTree {
    public static TreeNode solve(TreeNode root){
        if(root == null) return root;

        TreeNode left = solve(root.left);
        TreeNode right = solve(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        GenerateTree.print(tree);
        System.out.println();
        TreeNode res = solve(tree);
        GenerateTree.print(res);
    }
}
