package dailybyte.list;

public class ReverseList {
    public static LinkedList solve(LinkedList head){
        LinkedList prev = null;
        while(head != null){
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        LinkedList reversed = solve(list);
        GenerateLinkedList.print(reversed);
    }
}
