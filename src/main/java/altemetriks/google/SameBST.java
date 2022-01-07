package altemetriks.google;

public class SameBST {
    public static boolean solve(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        return (t1.value == t2.value) && solve(t1.left, t2.left) && solve(t1.right, t2.right);
    }
}
