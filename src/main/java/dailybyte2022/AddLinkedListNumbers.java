package dailybyte2022;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){this.val=val;}
}
public class AddLinkedListNumbers {
    //given two linkedlist, return thier sum
    //eg 2->4-3 and 5->6->4 will return 7->0->8
    //explanation 342 + 465 = 807
    public static ListNode solve(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode l3 = result;

        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = carry;
            if(l1 != null)
                sum += l1.val;
            if(l2 != null)
                sum += l2.val;
            ListNode newNode = new ListNode(sum % 10);
            l3.next = newNode;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }
        if(carry > 0){
            ListNode node = new ListNode(carry);
            l3.next = node;
            //l3 = l3.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = createFromArray(new int[]{2,4,3});
        ListNode l2 = createFromArray(new int[]{5,6,4});
        print(l1);
        print(l2);
        ListNode l3 = solve(l1,l2);
        print(l3);
    }

    public static ListNode createFromArray(int [] arr){
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        int index = 0;
        while(index < arr.length){
            ListNode node = new ListNode(arr[index++]);
            temp.next = node;
            temp = temp.next;
        }
        return result.next;
    }

    public static void print(ListNode node){
        ListNode temp = node;
        while(temp != null){
            System.out.print(temp.val);
            if (temp.next != null)
                System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
    }
}
