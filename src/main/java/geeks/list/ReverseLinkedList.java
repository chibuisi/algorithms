package geeks.list;

public class ReverseLinkedList {
    public static LinkedList solve(LinkedList head){
        if(head == null) return head;
        LinkedList prev = null;
        while(head != null){
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev.next;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        LinkedList head = solve(list);
        GenerateLinkedList.print(head);
    }
}
