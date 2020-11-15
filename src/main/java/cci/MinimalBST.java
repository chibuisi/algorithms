package cci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimalBST {
    public static void main(String[] args) {
        List<Integer> sortedNumbers = new ArrayList<>(Arrays.asList(1,3,6,7,8,9,10,13,14));
        Tree tree = minimalBST(sortedNumbers);
        //tree.traverse();
        tree.preOrderTraverse();
    }
    static Tree minimalBST(List<Integer> array){
        return minimalBSTHelper(array, null, 0, array.size()-1);
    }

    private static Tree minimalBSTHelper(List<Integer> array, Tree node, int startIdx, int endIdx) {
        if(startIdx > endIdx)
            return null;
        int midIdx = (startIdx + endIdx) / 2;
        int value = array.get(midIdx);
        if(node == null){
            node = new Tree();
            node.root = new Tree.Node(value);
        }
        else
            node.insert(value);
        minimalBSTHelper(array,node,startIdx,midIdx-1);
        minimalBSTHelper(array,node,midIdx+1,endIdx);
        return node;
    }
}
class Tree{
    Node root;
    void insert(int value){
        if(root == null)
            root = new Node(value);
        else
            root.insert(value);
    }
    void traverse(){
        if(root != null)
            root.traverse();
    }
    void preOrderTraverse(){
        if(root != null)
            root.preorderTraverse();
    }
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }

        void insert(int value){
            if(value == data)
                return;
            if(value > data){
                if(right == null)
                    right = new Node(value);
                else
                    right.insert(value);
            }
            else{
                if(left == null)
                    left = new Node(value);
                else
                    left.insert(value);
            }
        }
        void traverse(){
            if(left != null)
                left.traverse();
            System.out.println(data);
            if(right != null)
                right.traverse();
        }
        void preorderTraverse(){
            System.out.println(data);
            if(left != null)
                left.preorderTraverse();
            if(right != null)
                right.preorderTraverse();
        }
    }

}
