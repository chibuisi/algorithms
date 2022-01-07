package dailybyte.list;

public class RemoveNthNode {
    public static LinkedList solve(LinkedList head, int n){
        LinkedList temp = head;
        while(n > 0 && head != null){
            head = head.next;
            n--;
        }
        head.next = null;
        return temp;
    }
}
