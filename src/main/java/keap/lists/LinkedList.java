package keap.lists;

public class LinkedList {
    int value;
    LinkedList next;

    public LinkedList(int value){
        this.value = value;
    }

    public static LinkedList getInstance(){
        LinkedList zero = new LinkedList(0);
        LinkedList one = new LinkedList(1);
        LinkedList two = new LinkedList(2);
        LinkedList three = new LinkedList(3);
        LinkedList four = new LinkedList(4);
        LinkedList five = new LinkedList(5);

        zero.next = one; one.next = two; two.next = three; three.next = four; four.next = five;

        return zero;
    }

    public static void print(LinkedList head){
        LinkedList temp = head;
        while (temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
