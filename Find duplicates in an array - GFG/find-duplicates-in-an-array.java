// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
       /*ArrayList<Integer> element=new ArrayList<Integer>();
      int[] temp=new int[n];
       boolean p;
       int tem;
       for(int i=0;i<n;i++){
           temp[i]=-1;
       }
       for(int i=0;i<n;i++){
         /*  if(temp[arr[i]]){
               p=arr[i];
               element.add(p);
           }
           temp[arr[i]]=true;*///temp[arr[i]]=++temp[arr[i]];
           /*p=temp[arr[i]];
           if(p==false){
              temp[arr[i]]=true; 
           }
           else{
               tem=arr[i];
               element.add(tem);
           }*/
           
       //}
       /*for(int i=0;i<n;i++){
           if(temp[i]>0)
           element.add(i);
       }
        return element;*/
         ArrayList<Integer> a1 = new ArrayList<>();
       int[] d = new int[n];
       
       for(int i=0;i<n;i++){
           d[i] = -1;
       
}
       for(int i=0;i<n;i++){
           d[arr[i]] = ++d[arr[i]];
       }

       for(int i=0;i<n;i++){
           if(d[i]>0)
               a1.add(i);}
      
       if(a1.isEmpty())
           a1.add(-1);
           
           return a1;
    }
}
