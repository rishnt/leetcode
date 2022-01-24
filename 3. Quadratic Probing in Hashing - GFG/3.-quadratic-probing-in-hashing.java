// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- >0)
        {
            int hash_size = sc.nextInt();
            int N= sc.nextInt();
            
            int arr[] = new int[N];
            
            for(int i = 0; i < N ; i++)
             arr[i] = sc.nextInt();
             
            int hash_table[] = new int[hash_size];
            Solution obj = new Solution();
            obj.quadraticProbing(hash_table, hash_size, arr, N);
            
            for(int i = 0; i <hash_size; i++)
             System.out.print(hash_table[i] + " ");
             
             System.out.println();
             
        }
    }
    
}
// } Driver Code Ends


class Solution{
    //Function to fill the array elements into a hash table 
    //using Quadratic Probing to handle collisions.
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N)
    {
        //Your code here
       for(int i=0;i<hash_size;i++){
        hash[i]=-1;
    }
    int hashfuc = hash_size;
    int key ;
    for(int i=0;i<N;i++){
        if(hash_size == 0){
            return ;
        }
        key = arr[i]%hashfuc;
        int j=1;
        while(hash[key]!=-1 && hash_size >0){
            key = (arr[i]+(j*j))%hashfuc;
            j++;
        }
        hash[key] =arr[i];
   }
}
}
