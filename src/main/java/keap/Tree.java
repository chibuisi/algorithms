package keap;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    Tree left;
    Tree right;
    int value;

    public Tree(int value){
        this.value = value;
    }
}

class BinaryTree{
    public static void main(String[] args) {
        Tree zero = new Tree(0);
        Tree one = new Tree(1);
        Tree two = new Tree(2);
        Tree three = new Tree(3);
        Tree four = new Tree(4);
        Tree five = new Tree(5);
        Tree six = new Tree(6);

        four.left = two;
        four.right = five;
        two.right = three;
        two.left = one;
        one.left = zero;

        System.out.println(validate(four));

//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.inorder(four);
//        System.out.println();
//        binaryTree.preorder(four);
//        System.out.println();
//        binaryTree.postorder(four);
//        System.out.println();
//        binaryTree.levelorder(four);

    }
    private static boolean validate(Tree tree){
        if(tree == null)
            return true;
        return validate(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validate(Tree tree, int minValue, int maxValue) {
        if(tree.value < minValue || tree.value > maxValue)
            return false;
        if(tree.left != null && !validate(tree.left, minValue, tree.value))
            return false;
        if(tree.right != null && !validate(tree.right, tree.value, maxValue))
            return false;
        return true;
    }

    public static Tree merge(Tree t1, Tree t2){
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        t1.value += t2.value;
        t1.left = merge(t1.left, t2.left);
        t1.right = merge(t1.right, t2.right);
        return t1;
    }

    public void inorder(Tree tree){
        if(tree.left != null)
            inorder(tree.left);
        System.out.print(tree.value  + " => ");
        if(tree.right != null)
            inorder(tree.right);
    }

    public void preorder(Tree tree){
        System.out.print(tree.value + " => ");
        if(tree.left != null)
            preorder(tree.left);
        if(tree.right != null)
            preorder(tree.right);
    }

    public void postorder(Tree tree){
        if(tree.left != null)
            postorder(tree.left);
        if(tree.right != null)
            postorder(tree.right);
        System.out.print(tree.value + " => ");
    }

    public void levelorder(Tree tree){
        Queue<Tree> queue = new LinkedList<>();
        queue.add(tree);
        while(!queue.isEmpty()){
            Tree t = queue.remove();
            System.out.print(t.value + " => ");
            if(t.left != null)
                queue.add(t.left);
            if(t.right != null)
                queue.add(t.right);
        }
        System.out.println();
    }
}
