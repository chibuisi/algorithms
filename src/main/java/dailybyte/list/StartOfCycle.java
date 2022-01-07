package dailybyte.list;

import java.util.HashMap;
import java.util.Map;

public class StartOfCycle {
    public static int solve(LinkedList head) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        while(head != null){
            if(numsMap.containsKey(head.val))
                return head.val;
            else
                numsMap.put(head.val, head.val);
            head = head.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        System.out.println(solve(list));
    }
}
