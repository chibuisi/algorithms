package dailybyte2022;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class FindValueInTree {
    public static int solve(TreeNode node, int key){
        if(node == null)
            return -1;
        if(node.val == key)
            return node.val;
        if (node.val > key)
            return solve(node.left, key);
        else return solve(node.right, key);
    }
}
