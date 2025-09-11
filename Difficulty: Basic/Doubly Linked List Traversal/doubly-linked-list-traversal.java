// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        // your code here
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Node temp = head;
        while(temp!=null){
            ar.add(temp.data);
            temp = temp.next;
        }
        return ar;
    }
}