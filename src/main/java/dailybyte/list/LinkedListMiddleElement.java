package dailybyte.list;

public class LinkedListMiddleElement {
    public static int solve(LinkedList head){
        int count = 0;
        LinkedList temp = head;
        while(head != null){
            count++;
            head = head.next;
        }
        int middle = count / 2;
        while(middle > 0){
            temp = temp.next;
            middle--;
        }
        return temp.val;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        System.out.println(solve(list));
    }
}
