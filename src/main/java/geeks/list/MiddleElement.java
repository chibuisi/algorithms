package geeks.list;

public class MiddleElement {
    public static int solve(LinkedList head){
        if(head == null) return -1;
        LinkedList fast = head;
        LinkedList slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        System.out.println(solve(list));
    }
}
