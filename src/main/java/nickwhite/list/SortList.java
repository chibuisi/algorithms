package nickwhite.list;

public class SortList {
    //split and merge
    public static LinkedList solve(LinkedList head){
        if(head == null) return head;
        LinkedList slow = head;
        LinkedList fast = head;
        LinkedList prev = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev .next = null;

        LinkedList first = solve(head);
        LinkedList second = solve(slow);

        return merge(first,second);
    }

    private static LinkedList merge(LinkedList first, LinkedList second) {
        LinkedList temp = new LinkedList(0);
        LinkedList curr = temp;
        while(first != null && second != null){
            if(first.val < second.val){
                curr.next = first;
                first = first.next;
            }
            else {
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;
        }
        if(first != null){
            curr.next = first;
            first = first.next;
        }
        if(second != null){
            curr.next = second;
            second = second.next;
        }
        return temp.next;
    }
}
