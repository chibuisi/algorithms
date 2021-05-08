package apple.trees;

public class MergeBST {
    public static void main(String[] args) {
        int [] nums1 = {3,4,5};
        int [] nums2 = {1,2,3};

        BST t1 = BST.constructMinHeightBST(nums1);
        BST t2 = BST.constructMinHeightBST(nums2);

        BST tree = mergeBST(t1,t2);

        BST.print(tree);
    }

    public static BST mergeBST(BST t1, BST t2){
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        t1.value += t2.value;
        t1.left = mergeBST(t1.left,t2.left);
        t1.right = mergeBST(t1.right,t2.right);
        return t1;
    }
}
