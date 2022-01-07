package dailybyte.list;

public class PrintLinkedListReverse {
    public static void print(LinkedList head){
        if(head == null)
            return;
        print(head.next);
        System.out.print(head.val + " --->");
    }

    public static void main(String[] args) {
        LinkedList list = GenerateLinkedList.get();
        print(list);
    }
}
