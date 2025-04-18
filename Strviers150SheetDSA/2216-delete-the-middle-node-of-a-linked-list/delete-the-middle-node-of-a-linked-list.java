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
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null)return null;
        ListNode dummy = new ListNode(-1);

        dummy.next = head;

        ListNode first = head;
        ListNode second = head;
         ListNode prev = dummy;

        while(second != null && second.next != null){
            prev = first;
            first = first.next;
            second = second.next.next;
        }
        
            prev.next = first.next;
        
        

        return dummy.next;
        
    }
}