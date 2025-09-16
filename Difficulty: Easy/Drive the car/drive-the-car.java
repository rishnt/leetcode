// User function Template for Java

class Solution {
    // Function to calculate the difference between the maximum element in the array and
    // a given number k
    public int required(int[] arr, int k) {
        int min_unit = -1;
      for(int i=0;i<arr.length;i++){
          if(arr[i]>k){
              min_unit = Math.max(min_unit,arr[i]-k);
          }
      }
      return min_unit;
    }
}