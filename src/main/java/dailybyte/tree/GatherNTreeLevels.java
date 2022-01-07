package dailybyte.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GatherNTreeLevels {
    public static List<List<Integer>> solve(NTreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<NTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();

            for(int i = 0; i < size; i++){
                NTreeNode node = queue.remove();
                level.add(node.value);
                if(node.children != null)
                    queue.addAll(node.children);
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        NTreeNode tree = GenerateNTreeNode.get();
        System.out.println(solve(tree));
    }
}
