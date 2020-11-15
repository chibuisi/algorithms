package udemy.ds.tree;

public class Application {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(22);
        intTree.insert(54);
        intTree.insert(90);
        intTree.insert(32);
        intTree.insert(21);
        intTree.insert(40);

        //intTree.traverseInorder();
        //intTree.traversePreOrder();
        System.out.println(intTree.min());
        System.out.println(intTree.max());
    }
}
