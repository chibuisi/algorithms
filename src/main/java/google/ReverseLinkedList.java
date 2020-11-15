package google;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList node = new LinkedList(2);
        LinkedList node2 = new LinkedList(4);
        LinkedList node3 = new LinkedList(6);
        node.next = node2;
        node2.next = node3;
        print(node);
        LinkedList reversedNode = reverselist(node);
        print(reversedNode);
    }
    public static LinkedList reverselist(LinkedList head){
        LinkedList prev = null;
        while(head != null){
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public static void print(LinkedList head){
        while(head != null){
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static class LinkedList{
        int value;
        LinkedList next;

        public LinkedList(int value){
            this.value = value;
        }
    }
}
