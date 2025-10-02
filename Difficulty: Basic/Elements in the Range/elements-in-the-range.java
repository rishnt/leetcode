// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        
       boolean[] present = new boolean[B - A + 1];

    for (int i = 0; i < n; i++) {
        if (arr[i] >= A && arr[i] <= B) {
            present[arr[i] - A] = true;
        }
    }

    for (boolean val : present) {
        if (!val) return false;
    }
    return true;
    }
}
