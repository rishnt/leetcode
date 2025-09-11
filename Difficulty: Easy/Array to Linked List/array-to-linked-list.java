/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        
        if (arr.length == 0) return null; // empty array → no list

        // Create head node
        Node head = new Node(arr[0]);
        Node current = head;

        // Add remaining elements
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }
}
