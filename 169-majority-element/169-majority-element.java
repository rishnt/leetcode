class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
       int  ansInd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[ansInd]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ansInd=i;
                count=1;
            }
        }
        int c=0;
        int p=(nums.length)/2;
        for(int i=0;i<nums.length;i++){
            if(nums[ansInd]==nums[i]){
               c++ ;
            }
            if(c>p){
                return nums[ansInd]; 
            }
            
        }
        return -1;
    }
}