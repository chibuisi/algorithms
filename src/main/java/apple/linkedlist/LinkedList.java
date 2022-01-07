package apple.linkedlist;

public class LinkedList {
    int value;
    LinkedList next;

    public LinkedList(int value){
        this.value = value;
    }

    public LinkedList insert(LinkedList head, int value){
            LinkedList node = new LinkedList(value);
            node.next = head;
            head = node;
            return head;
    }

    public static void print(LinkedList head){
        while(head != null){
            System.out.print(head.value+" -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList head = new LinkedList(3);
        head = head.insert(head,8);
        head = head.insert(head,6);
        head = head.insert(head,7);
        print(head);
    }
}
