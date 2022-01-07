package dailychallenge.list;

public class Node {
    int value;
    Node next;
    Node prev;

    Node head;
    Node tail;

    public Node(int value){
        this.value = value;
    }

    public void addToFront(int value){
        Node newNode = new Node(value);
        if(head == null)
            head = tail = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void addToBack(int value){
        Node newNode = new Node(value);
        if(head == null)
            head = tail = newNode;
        tail.next = newNode;
        tail = newNode;
    }

    public int removeFromFront(){
        if(head == null)
            return -1;
        int value = head.value;
        if(head == tail)
            head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
        return value;
    }

    public int removeFromBack(){
        if(head == null)
            return -1;
        int value = tail.value;
        if(head == tail)
            head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        return value;
    }
}
