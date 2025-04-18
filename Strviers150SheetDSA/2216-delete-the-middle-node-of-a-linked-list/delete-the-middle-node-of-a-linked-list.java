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

        ListNode first = dummy;
        ListNode second = dummy;

        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        if(second == null){
            first.val = first.next.val;
            first.next = first.next.next;
        }else{
            first.next = first.next.next;
        }
        

        return dummy.next;
        
    }
}