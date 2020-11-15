package importantpractice.tree;

import lombok.Data;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

@Data
public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value == data)
            return;
        if(value < data){
            if(leftChild == null)
                leftChild = new Node(value);
            else
                leftChild.insert(value);
        }
        else{
            if(rightChild==null)
                rightChild = new Node(value);
            else
                rightChild.insert(value);
        }
    }

    public int min(){
        if(leftChild == null){
            return data;
        }
        else
            return leftChild.min();
    }
    public int max(){
        if(rightChild == null)
            return data;
        else return rightChild.max();
    }

    public Node get(int value){
        if(value == data)
            return this;
        if(value < data)
            if(leftChild != null)
                return leftChild.get(value);
        else
            if(rightChild != null)
                return rightChild.get(value);
        return null;
    }

    public void delete(int value){
        delete(this,value);
    }

    private Node delete(Node subroot, int value){
        if(subroot == null)
            return subroot;
        if(value < subroot.data)
            subroot.leftChild = delete(subroot.leftChild,value);
        else if(value > subroot.data)
            subroot.rightChild = delete(subroot.rightChild,value);
        else{
            if(subroot.leftChild == null)
                return subroot.rightChild;
            else if(subroot.rightChild == null)
                return subroot.leftChild;
            else {
                subroot.data = subroot.rightChild.min();
                subroot.rightChild = delete(subroot.rightChild, subroot.data);
            }
        }
        return subroot;
    }

    public void bfs(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(this);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println(node.data);
            if(node.leftChild != null)
                queue.add(node.leftChild);
            if(node.rightChild != null)
                queue.add(node.rightChild);
        }
    }

    public void inorderTraversal(){
        if(leftChild != null)
            leftChild.inorderTraversal();
        System.out.println(data);
        if(rightChild != null)
            rightChild.inorderTraversal();
    }

    public void preorderTraversal(){
        System.out.println(data);
        if(leftChild != null)
            leftChild.preorderTraversal();
        if(rightChild != null)
            rightChild.preorderTraversal();
    }

    public void postOrderTraversal(){
        if(leftChild != null)
            leftChild.postOrderTraversal();
        if(rightChild != null)
            rightChild.postOrderTraversal();
        System.out.println(data);
    }

}
