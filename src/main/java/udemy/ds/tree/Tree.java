package udemy.ds.tree;

public class Tree {
    private TreeNode root;

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else
            root.insert(value);
    }

    public TreeNode get(int value){
        if(root != null)
            return root.get(value);
        else return null;
    }

    public int min(){
        if(root == null)
            return Integer.MIN_VALUE;
        else return root.min();
    }

    public int max(){
        if(root == null)
            return Integer.MAX_VALUE;
        else
            return root.max();
    }

    /*
    case 1 : node is a leaf node
    case 2 : node has one child
    case 3 : node has two children
 */
    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value){
        if(subTreeRoot == null){
            return subTreeRoot;
        }

        if(value < subTreeRoot.getData()){
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(),value));
        }

        else if(value > subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),value));
        }
        else {
            //case 1 and 2 : zero or one child
            if(subTreeRoot.getLeftChild() == null){
                return subTreeRoot.getRightChild();
            }
            else if(subTreeRoot.getRightChild() == null){
                return subTreeRoot.getLeftChild();
            }
            //case 3 : two children
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),subTreeRoot.getData()));
        }
        return subTreeRoot;
    }


    public void traverseInorder(){
        if(root != null){
            root.inOrderTraversal();
        }
    }
    public void traversePreOrder(){
        if(root != null)
            root.preOrderTraversal();
    }
}
