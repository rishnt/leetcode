// User function Template for Java

class Solution {
    int totalCount(int k, int[] arr) {
       int count=0,i=0;
       while(i<arr.length){
           if(arr[i]%k==0){
               count+=arr[i]/k;
           }
           else if(arr[i]>k){
               count+=arr[i]/k;
               count++;
           }
           else{
               count++;
           }
           i++;
       }
       return count;
    }
}
