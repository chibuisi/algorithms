package dailybyte.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SUmOfLeftLeaves {
    public static int solve(TreeNode root){
        if(root == null) return 0;
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left == null)
                result += node.value;
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
        return result;
    }
}
