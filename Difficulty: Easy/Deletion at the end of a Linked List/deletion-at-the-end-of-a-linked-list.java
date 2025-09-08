/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
          Node temp=head;
      if(head.next==null) return null;
      if(head.next.next==null) {
          head.next=null;
          return head;
      }
    
      while(head.next.next!=null){
          head=head.next;
      }
      head.next=null;
      return temp;
    }
}