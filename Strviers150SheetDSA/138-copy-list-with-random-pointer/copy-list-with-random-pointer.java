/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

       if(head == null)return null;
        Node curr = head;
      
       HashMap<Node,Node> map = new HashMap<>();
       while(curr!= null){
        map.put(curr, new Node(curr.val));
        curr = curr.next; 

       }
        curr = head;
           
       while(curr!= null){

        Node temp = map.get(curr); 
        temp.next = map.get(curr.next);
        temp.random = map.get(curr.random);
        curr = curr.next;

       }

       return map.get(head);
    }
}