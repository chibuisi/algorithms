package dailybyte.list;

import java.util.HashMap;
import java.util.Map;

public class ContainsCycle {
    public static boolean solve(LinkedList head) {
        int value = head.val;
        while(head.next != null){
            head = head.next;
        }
        return head.val == value;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        System.out.println(solve(list));
    }
}
