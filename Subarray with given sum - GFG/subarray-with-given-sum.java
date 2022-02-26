// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {ArrayList<Integer> a=new ArrayList<Integer>();
        int sum=0;
    int prev=0;
    int i=0;
   while(sum!=s&&i<n){
        sum+=arr[i];
        if(sum>s){
            while(sum>s){
                sum=sum-arr[prev];
                prev++;
            }
        }
        i++;
   }
        if(sum==s){
            a.add(prev+1);
            a.add(i);
            
        }
        else{
            a.add(-1);
        }
    
   
    return a;
}
}