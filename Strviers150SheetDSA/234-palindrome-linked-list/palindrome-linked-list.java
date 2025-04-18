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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode rev = reverseList(mid);

        
        ListNode first = head;
        ListNode second = rev;
        while(second != null&& first.val == second.val ){
            first = first.next;
            second = second.next;
        }

        return second == null ? true: false;

    }
     public ListNode reverseList(ListNode head) {
        

        //  Iterative 
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        return prev;

        // */


        /*
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


        */
    }
     public ListNode middleNode(ListNode head) {

       
       if(head == null || head.next == null)return head;

        ListNode first = head;
         ListNode second = head;
        
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}