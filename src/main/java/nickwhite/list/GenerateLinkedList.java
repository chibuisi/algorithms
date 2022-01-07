package nickwhite.list;

public class GenerateLinkedList {
    public static LinkedList get(){
        LinkedList one = new LinkedList(1);
        LinkedList two = new LinkedList(2);
        LinkedList three = new LinkedList(3);
        LinkedList four = new LinkedList(4);
        LinkedList five = new LinkedList(5);
        LinkedList six = new LinkedList(6);
        LinkedList seven = new LinkedList(7);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        //seven.next = null;

        return one;
    }

    public static void print(LinkedList head){
        LinkedList curr = head;
        while(curr != null){
            System.out.print(curr.val + " => ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList head = get();
        print(head);
    }
}
