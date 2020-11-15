package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(4,null);
        LinkedList l2 = new LinkedList(2,l1);
        LinkedList l3 = new LinkedList(1,l2);
        LinkedList l4 = new LinkedList(4,null);
        LinkedList l5 = new LinkedList(3,l4);
        LinkedList l6 = new LinkedList(1,l5);
        LinkedList mergedList = mergeTwoList(l3,l6);
        print(mergedList);
        //LinkedList res = mergeTwoList(l6,l3);
    }
    public static LinkedList mergeTwoList(LinkedList l1, LinkedList l2){
        LinkedList tempNode = new LinkedList();
        LinkedList currentNode = tempNode;
        while(l1 != null && l2 != null){
            if(l1.value < l2.value){
                currentNode.next = l1;
                l1 = l1.next;
            }
            else{
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        if(l1 != null){
            currentNode.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            currentNode.next = l2;
            l2 = l2.next;
        }
        return tempNode.next;
    }
    public static void print(LinkedList head){
        while(head != null){
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static class LinkedList{
        int value;
        LinkedList next;

        LinkedList(){
            value = 0;
        }
        LinkedList(int val){
            this.value = val;
        }
        LinkedList(int val, LinkedList next){
            this.value = val;
            this.next = next;
        }
        public String toString(){
            return ""+value;
        }
    }
}

