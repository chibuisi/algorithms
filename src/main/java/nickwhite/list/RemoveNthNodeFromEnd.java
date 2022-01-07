package nickwhite.list;

public class RemoveNthNodeFromEnd {
    public static LinkedList solve(LinkedList head, int n){
//        LinkedList temp = new LinkedList(0);
//        temp.next = head;
        LinkedList fast = head;
        LinkedList slow = head;

        for(int i = 0; i < n+1; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow= slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        GenerateLinkedList.print(list);
        LinkedList result = solve(list, 2);

        System.out.println();
        GenerateLinkedList.print(result);

        System.out.println();
    }
}
