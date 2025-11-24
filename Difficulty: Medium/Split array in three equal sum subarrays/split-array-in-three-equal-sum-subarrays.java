// User function Template for Java
class Solution {

    public List<Integer> findSplit(int[] arr) {
       List<Integer> ans = new ArrayList<Integer>();
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
       }
       
       if(sum%3!=0){
           ans.add(-1);
           ans.add(-1);
           return ans;
       }
       
       
       int curr=0,n=arr.length;
       for(int i=0;i<n;i++){
           curr+=arr[i];
           if(curr==sum/3){
               ans.add(i);
               curr=0;
               
               if(ans.size()==2 && i<n-1){
                   return ans;
               }
           }
       }
       
       ans.add(-1);
       ans.add(-1);
       return ans;
    }
}