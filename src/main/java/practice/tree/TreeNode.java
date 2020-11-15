package practice.tree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int value){
        this.data = data;
    }

    public void insert(int value){
        if(data == value){
            return;
        }
        if(value < data){
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value){
        if(value == data){
            return this;
        }
        else if(value < data){
            return leftChild.get(value);
        }
        else {
            return rightChild.get(value);
        }
    }

    public int min(){
        if(leftChild == null){
            return data;
        }
        else{
            return leftChild.min();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
