package udemy.ds.linkedlist;

public class LinkedList {
    private Node head;

    public void add(Integer value){
        Node node = new Node(value);
        node.setNext(head);
        head = node;
    }

    public Integer remove(){
        if(head == null)
            return null;
        Integer removedValue = (Integer) head.getData();
        head =  head.getNext();
        return removedValue;
    }

    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}
