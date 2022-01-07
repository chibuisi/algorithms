package apple.trees;

public class IsomorphicTree {
    public static void main(String[] args) {

    }
    public static boolean isIsomorphic(Tree t1, Tree t2){
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        if(t1.value != t2.value)
            return false;
        return (isIsomorphic(t1.left, t2.left) && isIsomorphic(t1.right, t2.right)) || (isIsomorphic(t1.left, t2.right) && isIsomorphic(t1.right, t2.left));
    }
}
