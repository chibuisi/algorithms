package udemy.ds.doublylinkedlist;

public class LinkedList {
    int value;
    LinkedList next;
    LinkedList prev;

    LinkedList head;
    LinkedList tail;

    public LinkedList(){}

    public LinkedList(int value){
        this.value = value;
    }

    public void addToFront(int value){
        LinkedList newNode = new LinkedList(value);
        if(head == null)
            head = tail = newNode;
        newNode.next = head;
        head = newNode;
    }

    public int removeFromFront(){
        int value = -1;
        if(head == null)
            return value;
        value = head.value;
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        return value;
    }

    public void addToBack(int value){
        LinkedList newNode = new LinkedList(value);
        if(head == null)
            head = tail = newNode;
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeFromBack(){
        int value = -1;
        if(head == null)
            return value;
        value = tail.value;
        if(head == tail){
            head = tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        return value;
    }

    public void print(){
        if (head == null)
            System.out.println("List is empty");
        LinkedList temp = head;
        while(temp != null){
            System.out.print(temp.value);
            if(temp.next != null)
                System.out.print("--->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToFront(1);
        list.addToBack(2);
        list.addToFront(3);
        list.addToBack(4);
        list.print();
        list.removeFromBack();
        list.print();
        list.removeFromFront();
        list.print();
        list.addToBack(7);
        list.print();
        list.addToFront(9);
        list.print();
        list.reverse();
        list.print();
    }

    public void reverse(){
        if(head == null) return;
        LinkedList prev = null;
        LinkedList temp = head;
        while(temp != null){
            LinkedList next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }
}
