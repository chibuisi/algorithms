package delete;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public static void main(String[] args) {
        Tree one = new Tree(1);
        Tree two = new Tree(2);
        Tree three = new Tree(3);

        one.left = two;
        one.right = three;

        List<Integer> treeAsList = inorder(one);
        treeAsList.forEach(System.out::println);
    }

    public static List<Integer> inorder(Tree root){
        List<Integer> output = new ArrayList<>();
        if(root == null)
            return output;
        inorderHelper(root, output);
        return output;
    }
    public static void inorderHelper(Tree tree, List<Integer> integerList){
        if(tree.left != null)
            inorderHelper(tree.left,integerList);
        integerList.add(tree.data);
        if(tree.right != null)
            inorderHelper(tree.right, integerList);
    }
}

class Tree{
    int data;
    Tree left;
    Tree right;

    public Tree(int data){
        this.data = data;
    }
}