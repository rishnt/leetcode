/*  Structure of Node
class Node
 {
    char data;
    Node next;

    // Constructor to create a new node
    Node(char d)
    {
       data = d;
       next = null;
    }
 }*/

class Solution {
    int compare(Node head1, Node head2) {
        Node temp = head1;
        String s1 = "";
        String s2 = "";
        while(temp!= null){
            s1+=temp.data;
            temp = temp.next;
        }
        temp = head2;
        while(temp!= null){
            s2+=temp.data;
            temp = temp.next;
        }
         int cmp = s1.compareTo(s2);
         if (cmp == 0) return 0;   // identical
    else if (cmp > 0) return 1;   // first > second
    else return -1;
    }
}