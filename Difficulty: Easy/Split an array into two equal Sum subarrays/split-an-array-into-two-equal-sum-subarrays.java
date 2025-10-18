class Solution {
    public boolean canSplit(int arr[]) {
      int sum=0;
      for(int i=0;i<arr.length;i++){
          sum+=arr[i];
      }
      int temp_sum=0;
      for(int i=0;i<arr.length;i++){
          temp_sum +=arr[i];
          if(sum-temp_sum == temp_sum){
              return true;
          }
      }
      return false;
    }
}