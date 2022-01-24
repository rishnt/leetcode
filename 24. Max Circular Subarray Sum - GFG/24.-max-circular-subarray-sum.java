// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Solution{
 // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
       if(n==1){
            return a[0];
        }
        boolean start=allNegative(a,n);
        if(start==true){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int k=kadane(a,n);
        int rk=reverseKadane(a,n);
        rk=rk+sum;
        
        return Math.max(k,rk);
        }
        else{
            int min=0;
           int min1=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                min=a[i];
                min1=Math.max(min1,min);
            }
                return min1;
        }
        }
       
          // int k=kadane(a,n);
         //int k1=reverseKadane(a,n);
         
         //int kmax=Integer.max(k,k1);
       //return kmax;
          
        
        //return Integer.max(kadane(a,n), reverseKadane(a,n));
   static int kadane(int a[],int n){
            int sum=0;
            int maxsum=0;
            for(int i=0;i<n;i++){
                sum+=a[i];
                if(sum>maxsum){
                    maxsum=sum;
                }
                 if(sum<0){
                    sum=0;
                }
               
              }
               return maxsum;
          }
    static   int reverseKadane(int a[],int n){
          /* int sum=0;
           int sum2=0;
           for(int i=0;i<n;i++)
           {
               sum+=a[i];
           }*/
               for(int i=0;i<n;i++)
               {
                   a[i]=-a[i];
                  }
               int sum1=0;
               int maxsum1=0;
               for(int i=0;i<n;i++)
               {
                   sum1+=a[i];
                   if(sum1>maxsum1)
                   {
                       maxsum1=sum1;
                   }
                   else if(sum1<0){
                       sum1=0;
                   }
               }
           return maxsum1;
           
          
       }
       static boolean allNegative(int a[],int n){
           boolean flag;
           for(int i=0;i<n;i++){
               if(a[i]>0)
                   return true;
           }
           return false;
       }
 }

