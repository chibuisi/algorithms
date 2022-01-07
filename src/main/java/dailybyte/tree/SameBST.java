package dailybyte.tree;

public class SameBST {
    public static boolean solve(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        return (t1. value == t2.value) && solve(t1.left, t2.left) && solve(t1.right, t2.right);
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        TreeNode tree2 = GenerateTree.create(new int[]{1,2,3});
        System.out.println(solve(tree,tree));
    }

}
