package nickwhite.list;

public class LinkedListCycle {
    public static boolean containsCycle(LinkedList head){
        if(head == null) return false;
        LinkedList slow = head;
        LinkedList fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList head = GenerateLinkedList.get();
        System.out.println(containsCycle(head));
    }
}
