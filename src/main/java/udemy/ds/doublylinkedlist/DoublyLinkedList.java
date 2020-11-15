package udemy.ds.doublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void add(int value){
        Node node = new Node(value);
        node.setNext(head);
        if(head == null)
            tail = node;
        else
            head.setPrev(node);
        head = node;

    }

    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}
