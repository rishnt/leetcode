/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
       Node temp = head;
       while(temp.next!=null && temp.next.next!=null){
           Node curr= temp.next.next;
           temp.next = curr;
           temp = curr;
       }
       temp.next=null;
    }
}