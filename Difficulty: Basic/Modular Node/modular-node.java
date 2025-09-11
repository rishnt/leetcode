/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/
// Your task is to complete the function
// function should return the modular Node
// if no such node is present then return -1
class Solution {
    public int modularNode(Node head, int k) {
        // Code here//Position this line where user code will be pasted.
        Node temp = head;
        int count = 1;
        int modular_node = -1;
        while(temp!=null){
            if(count%k==0){
                modular_node = temp.data;
            }
            count++;
            temp = temp.next;
        }
        return modular_node;
    }
}