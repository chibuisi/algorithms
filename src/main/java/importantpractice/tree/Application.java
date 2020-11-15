package importantpractice.tree;

public class Application {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(2);
        tree.insert(9);
        tree.delete(9);
        tree.insert(4);
        tree.insert(0);
        tree.preorderTraversal();
    }
}
