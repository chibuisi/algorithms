package dailybyte.tree;

public class LowestCommonAncestor {
    public static TreeNode solve(TreeNode root, TreeNode a, TreeNode b){
        if(root == null) return root;
        if(a.value < root.value && b.value < root.value){
            solve(root.left, a, b);
        }
        if(a.value > root.value && b.value > root.value){
            solve(root.right, a, b);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = GenerateTree.get();
        TreeNode result = solve(treeNode, new TreeNode(1), new TreeNode(4));
        System.out.println(result.value);
    }
}
