package practice.tree;

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
        if(root == null){
            return root;
        }
        else{
            return root.get(value);
        }
    }

    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else
            return root.min();
    }

    public TreeNode delete(int value){
        root = delete(root, value);
        return root;
    }
    public TreeNode delete(TreeNode subTreeRoot, int value){
        if(subTreeRoot == null){
            return subTreeRoot;
        }
        if(subTreeRoot.getData() < value){
            subTreeRoot.setLeftChild(delete(subTreeRoot.getRightChild(),value));
        }
        else if(subTreeRoot.getData() > value){
            subTreeRoot.setRightChild(delete(subTreeRoot.getLeftChild(),value));
        }
        else{
            //case 1 and 2 : 0 or 1 child
            if(subTreeRoot.getLeftChild() == null){
                return subTreeRoot.getRightChild();
            }
            else if(subTreeRoot.getRightChild() == null){
                subTreeRoot.getLeftChild();
            }
            //replace value
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            //remove the node that had the min
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.min()));

        }
        return subTreeRoot;
    }

}
