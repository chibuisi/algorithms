package udemy.ds.doublylinkedlist;

import udemy.ds.linkedlist.LinkedList;

public class Application {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(new Integer(5));
        list.add(12);
        list.add(3);

        list.printList();
    }
}
