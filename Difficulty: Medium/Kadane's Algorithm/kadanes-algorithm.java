class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max_sum = Integer.MIN_VALUE;
       int sum = 0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
           if(sum>max_sum) max_sum = sum;
           if(sum<0){
               sum =0;
           }
       }
       return max_sum;
    }
}
