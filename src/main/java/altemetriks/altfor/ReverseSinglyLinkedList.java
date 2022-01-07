package altemetriks.altfor;

public class ReverseSinglyLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(new Node(1));
        list.addLast(new Node(5));
        list.addAtIndex(new Node(2), 1);
        list.addAtIndex(new Node(3), 2);
        list.addAtIndex(new Node(4), 3);

//        list.deleteLast();
//        list.deleteFirst();
//        list.deleteAtIndex(1);

        reverse(list);
        list.print();
    }

    public static Node reverse(MyLinkedList list){
        Node prev = null;
        while(list.head!=null){
            Node next = list.head.next;
            list.head.next = prev;
            prev = list.head;
            list.head = next;
        }
        return prev;
    }
}

class MyLinkedList {
    int size = 0;
    Node head = null;
    Node tail = null;

    public MyLinkedList() {

    }

    public void addFirst(Node node) {
        if (head == null && tail == null) {
            head = tail = node;
        }
        else if (head != null) {
            node.next = head;
            head = node;
        }

        size++;
    }

    public void addLast(Node node) {
        if (head == null && tail == null) {
            head = tail = node;
        }
        else if(tail != null) {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void addAtIndex(Node node, int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Index is out of bound!");

        if (index == 0) addFirst(node);
        else if(index == size) addLast(node);
        else {
            Node pointer = fetchNode(index);
            node.next = pointer.next;
            pointer.next = node;
        }

        size++;
    }

    public void deleteFirst() {
        if (size == 0) return;

        if (head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
        }

        size--;
    }

    public void deleteLast() {
        if (size == 0) return;

        if (head == tail)
            head = tail = null;
        else {
            Node pointer = head;
            while(pointer.next.next != null) {
                pointer = pointer.next;
            }
            pointer.next = null;
            tail = pointer;
        }

        size--;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index is out of bound!");

        if (index == 0) deleteFirst();
        else if(index == size - 1) deleteLast();
        else {
            Node pointer = fetchNode(index);
            pointer.next = pointer.next.next;
        }

        size--;
    }

    private Node fetchNode(int index) {
        Node pointer = head;
        for (int i = 0; i < index - 1; i++) {
            pointer = pointer.next;
        }
        return pointer;
    }

    public int size() {
        return this.size;
    }
    public void print(){
        while (head!=null){
            System.out.println(head.key+" => ");
            head = head.next;
        }
    }
}

class Node {
    int key;
    Node next;

    public Node () {

    }

    public Node (int key) {
        this.key = key;
    }

    public Node (Node node) {
        this.next = node;
    }

    public Node (int key, Node node) {
        this.key = key;
        this.next = node;
    }
}