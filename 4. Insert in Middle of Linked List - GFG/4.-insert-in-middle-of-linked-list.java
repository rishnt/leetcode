// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            
            //display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
// } Driver Code Ends


/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
    
      Node curr=head;
       float c=0;
      while(curr!=null){
          c++;
          curr=curr.next;}
          int pos=0;
      /*if(c%2!=0){
          pos=(c+1)/2;
      }
      else{
          pos=c/2;
      }*/
        pos=(int)Math.ceil(c/2);
    
       curr=head;
      for(int i=1;i<=pos-1;i++){
          curr=curr.next;
      }
      Node t=new Node(data);
      t.next=curr.next;
      curr.next=t;
      return head;
    
    }
}