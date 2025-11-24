class Solution {
    public int maxLen(int[] arr) {
     HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
     int sum=0,ans=0;
     h.put(0,-1);
     
     for(int i=0;i<arr.length;i++){
         if(arr[i]==0){
             sum+=-1;
         }
         else if(arr[i]==1){
             sum+=1;
         }
         
         if(h.containsKey(sum)){
             int idx = h.get(sum);
             int len= i-idx;
             if(len>ans){
                 ans=len;
             }
         }
         else{
             h.put(sum,i);
         }
     }
     return ans;
    }
}