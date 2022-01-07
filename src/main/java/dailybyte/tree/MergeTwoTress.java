package dailybyte.tree;

public class MergeTwoTress {
    public static TreeNode solve(TreeNode t1, TreeNode t2){
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        t1.value += t2.value;
        t1.left = solve(t1.left, t2.left);
        t1.right = solve(t1.right, t2.right);
        return t1;
    }

    public static void main(String[] args) {
        TreeNode t1 = GenerateTree.get();
        TreeNode t2 = GenerateTree.get();

        TreeNode res = solve(t1,t2);
        print(res);
    }

    public static void print(TreeNode tree){
        if(tree == null) return;
        print(tree.left);
        System.out.print(tree.value + "--->");
        print(tree.right);
    }
}
