// User function Template for Java

class Solution {
    // Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {
       HashMap<String, Integer> h = new HashMap<String,Integer>();
       String[] ans = new String[2];
       for(int i=0;i<arr.length;i++){
           h.put(arr[i],h.getOrDefault(arr[i],0)+1);
       }
       int max_votes = 0;
      String won = "";

    // Find candidate with max votes
    for (String candidate : h.keySet()) {
        int votes = h.get(candidate);

        if (votes > max_votes) {
            max_votes = votes;
            won = candidate;
        } else if (votes == max_votes) {
            // Tie → choose lexicographically smaller
            if (candidate.compareTo(won) < 0) {
                won = candidate;
            }
        }
    }
    
      ans[0] = won;
    ans[1] = String.valueOf(max_votes);
    return ans;
    }
}
