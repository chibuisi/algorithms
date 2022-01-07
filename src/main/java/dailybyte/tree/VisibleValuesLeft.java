package dailybyte.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VisibleValuesLeft {
    public static List<Integer> solve(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(i == 0)
                    result.add(node.value);
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        System.out.println(solve(tree));
    }
}
