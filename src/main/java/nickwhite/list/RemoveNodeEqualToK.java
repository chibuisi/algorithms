package nickwhite.list;

public class RemoveNodeEqualToK {
    public static LinkedList solve(LinkedList head, int k){
        if(head == null) return head;
        while(head != null && head.val == k)
            head = head.next;
        LinkedList curr = head;
        while(curr != null && curr.next != null){
            if(curr.next.val == k)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        GenerateLinkedList.print(list);
        System.out.println();
        LinkedList result = solve(list, 5);
        GenerateLinkedList.print(result);

    }
}
