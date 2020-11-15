package udemy.ds.linkedlist;

public class Node<Integer> {
    private Integer data;
    private Node next;

    public Node(Integer data){
        data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
