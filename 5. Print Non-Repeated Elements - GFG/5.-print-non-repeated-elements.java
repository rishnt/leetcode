// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- >0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n=Integer.parseInt(str[0]);
            int arr[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            ArrayList<Integer> v = new Solution().printNonRepeated(arr, n);
            
            for(int i=0;i<v.size();i++){
                System.out.print(v.get(i)+" ");
            }
            
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return non-repeated elements in the array.
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        ArrayList<Integer> inp=new ArrayList<Integer>();
        HashMap<Integer,Integer> imp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(imp.containsKey(arr[i])){
                imp.put(arr[i],imp.get(arr[i])+1);
            }
            else{
                imp.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(imp.get(arr[i])==1){
                inp.add(arr[i]);
            }
        }
        return inp;
    }
}

