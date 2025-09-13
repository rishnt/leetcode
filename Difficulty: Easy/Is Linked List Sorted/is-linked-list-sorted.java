/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public boolean isSorted(Node head) {
     if (head == null || head.next == null) return true;

    Node temp = head;
    boolean nonDec = true, nonInc = true;

    while (temp.next != null) {
        if (temp.data < temp.next.data) {
            nonInc = false;  // not non-increasing
        } else if (temp.data > temp.next.data) {
            nonDec = false;  // not non-decreasing
        }
        temp = temp.next;
    }

    return nonDec || nonInc;
    }
}