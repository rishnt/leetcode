class Solution {
    public int maxSubarraySum(int[] arr, int k) {
      
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
          int max_sum = sum;
        for(int i=k;i<arr.length;i++){
            sum = sum-arr[i-k]+arr[i];
            max_sum = Math.max(sum,max_sum);
        }
        return max_sum;
    }
}