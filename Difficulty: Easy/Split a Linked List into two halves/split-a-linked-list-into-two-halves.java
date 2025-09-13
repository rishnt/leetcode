/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        
         if (head == null || head.next == head) {
        // Only one node, return itself and null
        return new Pair<>(head, null);
    }
        Node slow=head;
        Node fast =head;
        while(fast.next!=head && fast.next.next!=head){
            slow=slow.next;
            fast = fast.next.next;
        }
        if(fast.next.next==head){
            fast = fast.next;
        }
        Node second_head = slow.next;
        slow.next = head;
        
      fast.next = second_head;
    return new Pair<>(head, second_head);
    }
}