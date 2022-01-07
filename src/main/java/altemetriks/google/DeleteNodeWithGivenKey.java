package altemetriks.google;

public class DeleteNodeWithGivenKey {
    public static ListNode solve(ListNode head, int k){
        if(head == null) return head;
        while (head != null && head.value == k)
            head = head.next;
        ListNode curr = head;
        while(curr.next != null){
            if(curr.next.value == k)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode res = solve(ListNode.getInstance(), 4);
        ListNode.print(res);
    }
}
