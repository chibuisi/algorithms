package apple.linkedlist;

public class PalidromeLinkedList {
    public static void main(String[] args) {
        LinkedList head = new LinkedList(1);
        head = head.insert(head,5);
        head = head.insert(head,5);
        head = head.insert(head,1);
        LinkedList.print(head);
        System.out.println();
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(LinkedList head){
        LinkedList slow = head;
        LinkedList fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);
        fast = head;

        while(slow != null){
            if(slow.value != fast.value)
                return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
    private static LinkedList reverse(LinkedList head){
        LinkedList prev = null;
        while(head != null){
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
