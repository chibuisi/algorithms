package dailybyte.tree;

import java.util.*;

public class BottomsUp {
    public static  List<List<Integer>> solve(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                list.add(node.value);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            result.add(list);
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String [] args){
        TreeNode tree = GenerateTree.get();
        GenerateTree.print(tree);
        System.out.println();
        System.out.println(solve(tree));
        TreeNode tree2 = GenerateTree.create(new int[]{3,5,6,7,9});
        GenerateTree.print(tree2);
        System.out.println();
        System.out.println(solve(tree2));
    }

}
