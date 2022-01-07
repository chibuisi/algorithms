package udemy.ds.singlylinkdelist;

public class LinkedList {
    int value;
    LinkedList next;

    LinkedList head;
    LinkedList tail;

    LinkedList(){}

    public LinkedList(int value){
        this.value = value;
    }

    public void addToFront(int value){
        LinkedList newNode = new LinkedList(value);
        if(head == null){
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int removeFromFront(){
        if(head == null) return -1;
        int value = head.value;
        head = head.next;
        return value;
    }

    public void addToBack(int value){
        LinkedList newNode = new LinkedList(value);
        if(head == null)
            head = tail = newNode;
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int removeFromBack(){
        int value = -1;
        if(head == null) return -1;
        if(head == tail)
            head = tail = null;
        else{
            LinkedList curr = head;
            while(curr.next != tail){
                curr = curr.next;
            }
            tail = curr;
            value = tail.next.value;
            tail.next = null;
        }
        return value;
    }

    public void print(){
        if(head == null) System.out.println("List is empty");
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
       list.addToFront(2);
       list.addToFront(3);
       list.addToFront(4);
       list.print();
       list.removeFromFront();
       list.print();
        System.out.println(list.tail.value);
        list.addToBack(5);
        list.print();
        list.addToFront(6);
        list.print();
        list.addToBack(7);
        list.print();
        System.out.println(list.removeFromBack());
        list.print();
    }
}
