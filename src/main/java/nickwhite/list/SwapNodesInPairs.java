package nickwhite.list;

public class SwapNodesInPairs {
    public static LinkedList solve(LinkedList head){
        if(head == null) return head;
//        LinkedList temp = new LinkedList(0);
//        temp.next = head;
        LinkedList curr = head;
        while(curr != null && curr.next != null){
            LinkedList first = curr.next;
            LinkedList second = curr.next.next;
             first.next = second.next;
            curr.next = second;
            curr.next.next = first;
            curr = curr.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        GenerateLinkedList.print(list);
        LinkedList result = solve(list);

        System.out.println();
        GenerateLinkedList.print(result);
    }
}
