package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {


      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        //boundary case: single node
        int total = l1.val + l2.val;
        if(total >= 10){ // case: >=10, sometimes we might put >10 only
            carry = 1;
            total = total - 10;
        }
        ListNode l3 = new ListNode(total);
        ListNode head = l3;
        l1 = l1.next;
        l2 = l2.next;

        while(l1!=null || l2!=null || carry != 0 ){
            int sum = 0; int val1 = 0, val2 = 0;
             if(l1!=null ){
                val1 = l1.val;
                l1= l1.next;
            }


             if(l2!=null){
                val2 = l2.val;
                l2= l2.next;
            }


            sum = val1 + val2 + carry;
            if(sum >= 10){
                carry = 1;
                sum = sum - 10;
            }
            else{
                carry = 0;
            }
            l3.next = new ListNode(sum);
            l3 = l3.next;


        }

        return head;
    }

    public static void main(String[] args) {
          //2,4,3
         //5.6.4
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
      l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = addTwoNumbers(l1,l2);
        while(l3!=null){
            System.out.print(l3.val);
            System.out.print(" ");
            l3 = l3.next;
        }
    }


}
