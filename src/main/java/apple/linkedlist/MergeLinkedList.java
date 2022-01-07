package apple.linkedlist;

public class MergeLinkedList {
    public static void main(String[] args) {
        LinkedList head = new LinkedList(6);
        head = head.insert(head,5);
        head = head.insert(head,4);
        head = head.insert(head,3);
        LinkedList.print(head);
        System.out.println();
        LinkedList head1 = new LinkedList(4);
        head1 = head1.insert(head1,3);
        head1 = head1.insert(head1,2);
        head1 = head1.insert(head1,1);
        LinkedList.print(head1);
        System.out.println();
        LinkedList merged = merge(head,head1);
        LinkedList.print(merged);
    }

    public static LinkedList merge(LinkedList l1, LinkedList l2){
        LinkedList temp = new LinkedList(0);
        LinkedList current = temp;

        while(l1 != null && l2 != null){
            if(l1.value < l2.value){
                current.next = l1;
                l1 = l1.next;
            }
            else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            current.next = l2;
            l2 = l2.next;
        }
        return temp.next;
    }
}
