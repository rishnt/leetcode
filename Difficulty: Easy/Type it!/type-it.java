// User function Template for Java
 class Solution {
    int minOperation(String s) {
      int n = s.length();
        int ans = n; // default: type all characters one by one

        for (int k = 1; k <= n / 2; k++) {
            // check if prefix of length k repeats immediately
            if (s.substring(0, k).equals(s.substring(k, 2 * k))) {
                int cost = k + 1 + (n - 2 * k);
                ans = Math.min(ans, cost);
            }
        }
        return ans;
    }
}