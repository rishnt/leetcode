// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
          int sum=0,max_length = 0;
       HashMap<Integer,Integer> h =new HashMap<Integer,Integer>();
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum==k){
            max_length = Math.max(max_length,i+1);
        }
      
        if(h.containsKey(sum-k)){
            max_length = Math.max(max_length,i-h.get(sum-k));
        }
        if(!h.containsKey(sum)){
            h.put(sum,i);
        }
       }
       return max_length;
    }
}
