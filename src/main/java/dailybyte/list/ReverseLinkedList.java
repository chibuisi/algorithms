package dailybyte.list;

public class ReverseLinkedList {
    public LinkedList reverse(LinkedList head){
        if(head == null) return head;
        LinkedList prev = null;
        while(head != null){
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
