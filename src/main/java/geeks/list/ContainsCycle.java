package geeks.list;

public class ContainsCycle {
    public static boolean solve(LinkedList head) {
        if(head == null) return false;
        LinkedList fast = head.next;
        LinkedList slow = head;
        while(slow != fast){
            if(fast == null || fast.next == null)
                return false;
            fast = fast.next.next;
            slow = slow.next;

        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        System.out.println(solve(list));
    }
}
