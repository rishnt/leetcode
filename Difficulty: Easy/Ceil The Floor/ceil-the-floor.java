// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
         Arrays.sort(arr); // Ensure array is sorted

        int floor = -1;
        int ceil = -1;

        int low = 0, high = arr.length - 1;

        // Find floor
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                floor = arr[mid]; // possible floor
                low = mid + 1;     // move right to find greater but still <= x
            } else {
                high = mid - 1;
            }
        }

        // Reset for ceil
        low = 0;
        high = arr.length - 1;

        // Find ceil
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ceil = arr[mid]; // possible ceil
                high = mid - 1;   // move left to find smaller but still ≥ x
            } else {
                low = mid + 1;
            }
        }

        return new int[]{floor, ceil};
    }
}
