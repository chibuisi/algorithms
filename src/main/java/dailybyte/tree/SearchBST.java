package dailybyte.tree;

public class SearchBST {
    public static TreeNode solve(TreeNode root, int num){
        if(root == null) return root;
        if(root.value == num) return root;
        if(root.value < num)
            return solve(root.right, num);
        else
            return solve(root.left, num);
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        System.out.println(solve(tree,9));
    }
}
