package dailybyte.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateNTreeNode {
    public static NTreeNode get(){
        NTreeNode one = new NTreeNode(1,null);
        NTreeNode four = new NTreeNode(4,null);
        NTreeNode three = new NTreeNode(3,new ArrayList<>());
        NTreeNode five = new NTreeNode(5,new ArrayList<>());

        three.children.addAll(Arrays.asList(one,four,five));

        NTreeNode eight = new NTreeNode(8, null);
        NTreeNode six = new NTreeNode(6,null);
        NTreeNode nine = new NTreeNode(9, null);
        NTreeNode ten = new NTreeNode(10, null);
        NTreeNode two = new NTreeNode(2, null);

        five.children.addAll(Arrays.asList(eight, six, nine, ten));

        return three;
    }
}
