package apple.trees;

public class BST {
    int value;
    BST left;
    BST right;

    public BST(int value) {
        this.value = value;
    }

    public void insert(int value){
        if(value < this.value){
            if(left == null)
                left = new BST(value);
            else
                left.insert(value);
        }
        else{
            if(right == null)
                right = new BST(value);
            else
                right.insert(value);
        }
    }

    public static BST constructMinHeightBST(int [] nums){
        return bsthelper(nums, 0, nums.length-1, null);
    }

    private static BST bsthelper(int[] nums, int start, int end, BST node) {
        if(start > end)
            return null;
        int mid = start + (end - start) / 2;
        int value = nums[mid];
        if(node == null)
            node = new BST(value);
        else
            node.insert(value);
        bsthelper(nums, start, mid-1, node);
        bsthelper(nums, mid+1, end
                , node);
        return node;
    }

    public static void print(BST tree){
        if (tree == null)
            return;
        print(tree.left);
        System.out.println(tree.value);
        print(tree.right);
    }
}
