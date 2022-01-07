package keap;

public class LinkedList {
    int data;
    LinkedList next;

    public LinkedList(int data){
        this.data = data;
    }

    public LinkedList reverse(LinkedList head){
        LinkedList prev = null;
        while(head != null){
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public LinkedList mergeTwo(LinkedList l1, LinkedList l2){
        LinkedList temp = new LinkedList(0);
        LinkedList curr = temp;

        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 != null){
            curr.next = l1;
        }
        if(l2 != null){
            curr.next = l2;
        }
        return temp.next;
    }
}

