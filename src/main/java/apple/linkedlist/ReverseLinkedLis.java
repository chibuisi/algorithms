package apple.linkedlist;

public class ReverseLinkedLis {
    public static void main(String[] args) {
        LinkedList head = new LinkedList(3);
        head = head.insert(head,8);
        head = head.insert(head,6);
        head = head.insert(head,7);
        LinkedList.print(head);
        System.out.println();
        LinkedList reversed = reverse(head);
        LinkedList.print(reversed);
    }
    public static LinkedList reverse(LinkedList head){
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
