package altemetriks.google;

public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value){
        this.value = value;
    }

    public static ListNode getInstance(){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);

        one.next = two; two.next = three; three.next = four; four.next = five; five.next = six; six.next = seven;
        return one;
    }

    public static void print(ListNode head){
        ListNode node = head;
        while(node != null){
            System.out.print(node.value + " --> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        print(getInstance());
    }
}
