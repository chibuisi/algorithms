package nickwhite.list;

public class ReorderList {
    public static LinkedList solve(LinkedList head){
        if(head == null) return head;

        LinkedList fast = head;
        LinkedList slow = head;
        LinkedList temp = head;
        //split into two halves
        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;


        }
        temp.next = null;

        //reverse the second half
        LinkedList first = head;
        LinkedList second = reverse(slow);

        //merge both halves
        merge(first,second);
        return first;
    }

    private static LinkedList reverse(LinkedList head){
        LinkedList prev = null;
        while(head != null){
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    private static void merge(LinkedList l1, LinkedList l2){
        while(l1 != null){
            LinkedList l1Next = l1.next;
            LinkedList l2Next = l2.next;

            l1.next = l2;
           /* if(l1Next == null)
                break;*/
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        GenerateLinkedList.print(list);
        LinkedList result = solve(list);
        System.out.println();
        GenerateLinkedList.print(result);
    }
}
