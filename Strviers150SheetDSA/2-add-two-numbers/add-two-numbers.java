/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode first = l1;
        ListNode second = l2;

        int carry = 0;
        ListNode temp = new ListNode(-1);
        ListNode head = temp;

        while(first != null && second != null){
            int val = first.val+second.val+carry;
            if(val >=10){
                carry = val/10;
            }else{
                carry = 0;
            }
            val = val%10;
             ListNode temp2 = new ListNode(val);
             temp.next = temp2;
             temp = temp2;
             first = first.next;
             second = second.next;
            //  carry = 0;
        }

        while(first != null){
            int val = first.val+carry;
            if(val >=10){
                carry = val/10;
            }else{
                carry = 0;
            }
            val = val%10;
             ListNode temp2 = new ListNode(val);
             temp.next = temp2;
             temp = temp2;
             first = first.next;
        }
        while(second != null){
            int val = second.val+carry;
            if(val >=10){
                carry = val/10;
            }else{
                carry = 0;
            }
            val = val%10;
             ListNode temp2 = new ListNode(val);
             temp.next = temp2;
             temp = temp2;
             second = second.next;
        }
        if(carry>0){
            ListNode temp2 = new ListNode(carry);
             temp.next = temp2;
             temp = temp2;
            //  second = second.next;
        }
        return head.next;

        
    }
     public ListNode reverseList(ListNode head) {
        

        /*  Iterative 
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        return prev;

        */


        // /*
            // Recursive
           if(head == null || head.next == null) {
            return head;
           }

            ListNode curr = head;
            ListNode temp2 = curr.next;
           ListNode temp = reverseList(curr.next);
           temp2.next = curr;
        //    temp.next = curr.next;
        //    temp2.next = curr;

            curr.next = null;
           return temp;


        // */
    }
}