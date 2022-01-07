package dailybyte.list;

public class RemoveValue {
    public static LinkedList solve(LinkedList head, int value) {
        while(head != null && head.val == value)
            head = head.next;
        LinkedList temp = head;
        while(temp.next != null){
            if(temp.next != null && temp.next.val == value)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        LinkedList removeTwo = solve(list, 1);
        GenerateLinkedList.print(removeTwo);
    }
}
