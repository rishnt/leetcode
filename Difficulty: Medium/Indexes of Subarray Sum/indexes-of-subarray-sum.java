
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
      ArrayList<Integer> ar=new ArrayList<Integer>();
        int start=0,end=0,sum=0;
        int n=arr.length;
         if(target==0){
                ar.add(-1);
                return ar;
            }
        while(start<n){
            
           sum+=arr[start];
            if(sum>target){
                while(sum>target){
                    sum=sum-arr[end];
                    end++;
                }
            }
            if(sum==target){
                ar.add(end+1);
                ar.add(start+1);
                return ar;
            }
            
            if(sum<target){
                start++;
            }
        }
        ar.add(-1);
        return ar; 
        
    }
}
