package altemetriks.google;

public class MirrrorBinaryTree {
    public static TreeNode solve(TreeNode root){
        if(root == null)
            return root;
         TreeNode left = solve(root.left);
         TreeNode right = solve(root.right);

         root.left = right;
         root.right = left;

         return root;
    }
}
