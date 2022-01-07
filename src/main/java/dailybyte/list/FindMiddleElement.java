package dailybyte.list;

public class FindMiddleElement {
    public static int solve(LinkedList head){
        LinkedList slow = head;
        LinkedList fast = head;

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
