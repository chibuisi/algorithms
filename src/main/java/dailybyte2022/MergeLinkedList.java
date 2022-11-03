package dailybyte2022;

public class MergeLinkedList {
//list1 = 1->2->3, list2 = 4->5->6->null, return 1->2->3->4->5->6->null
//list1 = 1->3->5, list2 = 2->4->6->null, return 1->2->3->4->5->6->null
//list1 = 4->4->7, list2 = 1->5->6->null, return 1->4->4->5->6->7->null
    public static ListNode solve(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null){
            temp.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            temp.next = l2;
            l2 = l2.next;
        }
        return result.next;
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

    public static void main(String[] args) {
        ListNode l1 = createFromArray(new int[]{1,2,3});
        ListNode l2 = createFromArray(new int[]{4,5,6});
        ListNode l3 = solve(l1,l2);
        print(l3);
    }
}
