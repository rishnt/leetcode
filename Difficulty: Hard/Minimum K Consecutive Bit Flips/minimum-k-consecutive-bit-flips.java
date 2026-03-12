class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
          int n = arr.length;
        int ans = 0;
        int flipped = 0; // Tracks the current flip state (0 or 1)
 
        for (int i = 0; i < n; i++) {
            // If we've passed the end of a previous flip, update the state
            if (i >= k && arr[i - k] > 1) {
                flipped ^= 1;
                arr[i - k] -= 2; // Restore original value (optional)
            }
 
            // If current bit needs flipping (it's 0 when flipped state is even, or 1 when odd)
            if (flipped == arr[i]) {
                if (i + k > n) return -1; // Not enough space for a k-length flip
                
                ans++;
                flipped ^= 1;
                arr[i] += 2; // Mark that a flip started here
            }
        }
        return ans;
    }
}
