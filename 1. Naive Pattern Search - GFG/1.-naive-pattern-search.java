// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            Solution obj = new Solution();
            
            if(obj.search(p, s) ==  true)
              System.out.println("Yes");
            else
              System.out.println("No");
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
          int n=txt.length();
          int m=pat.length();
          for(int i=0;i<=n-m;i++){
              int j;
              for( j=0;j<m;j++){
                  if(pat.charAt(j)!=txt.charAt(i+j)){
                      break;
                  }
                 
                  
              }
               if(j==m)
                      return true;
          }
          return false;
    }
    
}