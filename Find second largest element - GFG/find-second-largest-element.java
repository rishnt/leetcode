// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.print2largest(a,n));
        }
        
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int print2largest(int A[],int N) 
    {int ma=0;
    int res=-1;
        for(int i=0;i<N;i++){
            ma=Math.max(A[i],ma);
        }
        for(int i=0;i<N;i++){
            if(A[i]<ma){
                int m=A[i];
                res=Math.max(res,A[i]);
            }
           
        }
        return res;
    }
}
        
