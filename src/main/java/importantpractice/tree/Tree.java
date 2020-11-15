package importantpractice.tree;

public class Tree {
    private Node root;

    public void insert(int value){
        if(root==null)
            root = new Node(value);
        else
            root.insert(value);
    }

    public Node get(int value){
        if(root == null)
            return null;
        return root.get(value);
    }

    public void bfs(){
        if(root != null)
            root.bfs();
    }

    public void inorderTraversal(){
        if(root != null)
            root.inorderTraversal();
    }

    public void preorderTraversal(){
        if(root != null){
            root.preorderTraversal();
        }
    }

    public void delete(int value){
        if(root != null)
            root.delete(value);
    }
}
