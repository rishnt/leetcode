/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int dist=0;
    public int minTime(Node root, int target) {
        // code here
          DFS(root,target);
         return dist;
    }
    
    private int DFS(Node root,int target)
    {
        if(root==null)
        return 0;
        int l= DFS(root.left,target);
       int  r= DFS(root.right,target);
       if(root.data==target)
        {
             dist=Math.max(dist,Math.max(DFS(root.left,target),DFS(root.right,target)));
            return -1;
            }
        if(l<0)
        {  
            dist=Math.max(dist,(Math.abs(l)+r));
                return l-1;
        }
        if(r<0)
        { 
            dist=Math.max(dist,(l+Math.abs(r)));
                return  r-1;
        } 
        return Math.max(l,r)+1;      
    }
}