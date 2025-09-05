// User function Template for Java

class Solution {
    public static String electionWinner(String arr[]) {
        // Your code here
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        
      String ans = "";
      int vote_count=-1;
      for(int i=0;i<arr.length;i++)
{
    if(h.get(arr[i])>vote_count){
        ans = arr[i];
        vote_count = h.get(arr[i]);
    }
}        
return ans;
    }
}