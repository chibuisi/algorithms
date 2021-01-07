package google;
/*
*This class contains operations on a binary search tree
* it contains the ffg
* 1. Constructing a minimum height BST
* 2. Validating a BST
*  3. Insert into a BST
* 4. Inverting a BST
* 6. Traversing a BST
 */
public class BinarySearchTree {
    public static void main(String[] args) {
        int [] nums = {1,2,3,5,6,8,9,11,14,15,18,25,124};
        BST root = constructMinHeightBST(nums);
        print(root);
        System.out.println();
        System.out.println(validateBST(root));
        BST invertedBST = invertBST(root);
        print(invertedBST);
        BST mergedBST = mergeBST(root, invertedBST);
        System.out.println();
        print(mergedBST);
    }
    public static boolean validateBST(BST root){
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private static boolean isValid(BST root, int min, int max){
        if(min > max)
            return false;
        if(root.left != null && !isValid(root.left, min, root.value)){
            return false;
        }
        if(root.right != null && !isValid(root.right, root.value, max)){
            return false;
        }
        return true;
    }
    public static BST constructMinHeightBST(int [] nums){
        return minHeightBST(nums, 0, nums.length-1, null);
    }

    private static BST minHeightBST(int[] nums, int start, int end, BST node) {
        if(start > end)
            return null;
        int mid = start + (end - start) / 2;
        int valueToAdd = nums[mid];
        if(node == null)
            node = new BST(valueToAdd);
        else{
            node.insert(valueToAdd);
        }
        minHeightBST(nums, start, mid-1, node);
        minHeightBST(nums, mid+1, end, node);
        return node;
    }
    public static BST mergeBST(BST one, BST two){
        if(one == null)
            return two;
        if(two == null)
            return one;
        one.value += two.value;
        one.left = mergeBST(one.left, two.left);
        one.right = mergeBST(one.right, two.right);
        return one;
    }
    public static BST invertBST(BST root){
        if(root == null)
            return null;
        swapLeftAndRight(root);
        invertBST(root.left);
        invertBST(root.right);
        return root;
    }

    private static void swapLeftAndRight(BST root) {
        BST temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void print(BST root){
        if(root.left != null)
            print(root.left);
        System.out.print(root.value+", ");
        if(root.right != null)
            print(root.right);
    }
    static class BST{
        int value;
        BST left;
        BST right;

        public BST(int value){
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
    }
}
