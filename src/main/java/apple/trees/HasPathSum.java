package apple.trees;

import java.util.Stack;

public class HasPathSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        BST tree = BST.constructMinHeightBST(nums);
        System.out.println(hasPathSum(tree,5));
    }
    public static boolean hasPathSum(BST tree, int sum){
        Stack<Integer> sumStack = new Stack<>();
        Stack<BST> nodeStack = new Stack<>();

        sumStack.push(sum - tree.value);
        nodeStack.push(tree);

        while(!nodeStack.isEmpty()){
            BST bst = nodeStack.pop();
            int currSum = sumStack.pop();

            if(bst.left == null && bst.right == null && currSum == 0)
                return true;
            if (bst.left != null){
                nodeStack.push(bst.left);
                sumStack.push(currSum - bst.left.value);
            }
            if(bst.right != null){
                nodeStack.push(bst.right);
                sumStack.push(currSum - bst.right.value);
            }
        }
        return false;
    }
}
