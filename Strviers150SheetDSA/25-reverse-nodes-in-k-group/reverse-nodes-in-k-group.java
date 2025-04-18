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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || head.next == null || k == 1)return head;


        // create a dummy node 
        ListNode dummy = new ListNode(-1);
        dummy.next = head;


        ListNode prevGroupEnd = dummy;

        ListNode temp = head;

        // get the kth node

        while(true){

            ListNode kthNode = getKthNode(prevGroupEnd.next, k);
            if(kthNode == null){
                // return false;
                break;
            }
            // 
            ListNode start = prevGroupEnd.next;
            ListNode nextGroupStart = kthNode.next;

            // Rev start t0 end

            rev(start, nextGroupStart);

            // connect pointers
            prevGroupEnd.next = kthNode;
            start.next = nextGroupStart;

            prevGroupEnd = start;

        }
        return dummy.next;

        
    }
    public void rev(ListNode start, ListNode end){

        ListNode curr = start;
        ListNode prev = null;

        while(curr != end){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        return ;
    }
    public ListNode getKthNode (ListNode start, int k ){
        
        int count = 1;

        ListNode temp = start;
        while(temp != null && count < k){
            temp = temp.next;
            count++;
        }

        return count == k? temp:null;
    }
}