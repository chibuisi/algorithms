package keap.lists;

public class ReverseList {
    public static LinkedList reverse(LinkedList head){
        LinkedList prev = null;
        while(head != null){
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev
                ;
    }

    public static void main(String[] args) {
        LinkedList head = LinkedList.getInstance();
        LinkedList.print(head);
        LinkedList reversed = reverse(head);
        LinkedList.print(reversed);
    }
}
