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