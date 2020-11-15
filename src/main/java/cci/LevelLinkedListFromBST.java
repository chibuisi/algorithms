package cci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelLinkedListFromBST {
    public static void main(String[] args) {

    }
    public static List<LinkedList<Tree>> createLevelLinkedList(Tree root){
        List<LinkedList<Tree>> lists = new ArrayList<>();
        createLevelLinkedList(root, lists,0);
        return lists;
    }
    public static void createLevelLinkedList(Tree root, List<LinkedList<Tree>> lists, int level){
        if(root == null)
            return;
        LinkedList<Tree> list = null;
        if(list.size() == level){
            list = new LinkedList<>();
            lists.add(list);
        }
        else{
            list = lists.get(level);
        }
        list.add(root);
        createLevelLinkedList(root,lists,level+1);
        createLevelLinkedList(root,lists,level+1);
    }
}
