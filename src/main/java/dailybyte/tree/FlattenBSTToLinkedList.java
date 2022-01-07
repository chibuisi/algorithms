package dailybyte.tree;

import java.util.Stack;

public class FlattenBSTToLinkedList {
    public static void solve(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.right != null)
                stack.push(node.right);
            if(node.left != null)
                stack.push(node.left);
            if(!stack.isEmpty())
                node.right = stack.peek();
            node.left = null;
        }
    }

    public static void main(String[] args) {
        TreeNode tree = GenerateTree.get();
        GenerateTree.print(tree);
        solve(tree);
        System.out.println();
        GenerateTree.print(tree);
    }
}
