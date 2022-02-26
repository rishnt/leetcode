// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
     /*   int tep;
      for(int i=0;i<n;i++){
          int current=array[i]-1;
          if(array[i]!=array[current]){
              tep=array[i];
              array[i]=array[current];
              array[current]=tep;
          }
          
      }
      for(int i=0;i<n;i++){
          if(array[i]!=i){
              return i;
          }
      }
      return -1;*/
      
      int sum=0;
     int sum1=0;
      for(int i=0;i<=n;i++){
          sum+=i;
      }
      for(int i=0;i<n-1;i++){
          sum1+=array[i];
      }
      return sum-sum1;
    }
}