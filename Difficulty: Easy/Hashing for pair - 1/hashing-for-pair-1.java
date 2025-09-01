// User function Template for Java

class Geeks {
    // Complete this function
    // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int sum) {
HashSet<Integer> h = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
        int complement = sum - arr[i];
        if (h.contains(complement)) {
            return 1; // Found a valid pair
        }
        h.add(arr[i]);
    }

    return 0;
    }
}