class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
      ArrayList<Integer> ans = new ArrayList<>();
    int n = arr.length;
    if (k <= 0 || k > n) return ans; // no full window

    Map<Integer, Integer> h = new HashMap<>();

    // build the first window
    for (int i = 0; i < k; i++) {
        h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
    }
    ans.add(h.size());

   for(int i=k;i<arr.length;i++){
       int out = arr[i-k];
       int in = arr[i];
       
       int count= h.get(out);
       if(count==1) h.remove(out);
       else h.put(out,count-1);
       
       
       h.put(in,h.getOrDefault(in,0)+1);
       
       ans.add(h.size());
   }
    

    return ans;
    }
}