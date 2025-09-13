// User function Template for Java

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

class Delete {
    Node deleteAtPosition(Node head, int pos) {
        if(pos==1){
            head=head.next;
            return head;
        }
        int count = 1;
        Node temp = head;
        while(temp!=null){
            if(count==pos-1){
                temp.next=temp.next.next;
            }
           temp=temp.next;
           count++;
        }
       
        return head;
    }
}
