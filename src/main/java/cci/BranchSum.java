package cci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//create a list of sum of all values in a branch of a bst
public class BranchSum {
    public static void main(String[] args) {
        cci.Tree tree = MinimalBST.minimalBST(new ArrayList<>(Arrays.asList(1,2,3,5,7,89,788)));

    }
    public static List<Integer> branchSums(Tree root){
        List<Integer> sums = new ArrayList<>();
        branchSums(root, sums, 0);
        return sums;
    }
    public static void branchSums(Tree root, List<Integer> sums, int runningSum){
        if(root == null)
            return;
        int newSum = runningSum + root.data;
        if(root.left == null && root.right == null)
            sums.add(newSum);
        branchSums(root.left,sums,newSum);
        branchSums(root.right,sums,newSum);
    }
    class Tree{
            int data;
            Tree left;
            Tree right;

            Tree(int data){
                this.data = data;
            }
    }
}
