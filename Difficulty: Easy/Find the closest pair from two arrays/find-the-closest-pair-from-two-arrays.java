class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        int i = arr1.length - 1; // arr1 ka last index (sabse bada element)
        int j = 0;               // arr2 ka first index (sabse chhota element)

        int minDiff = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();

        while (i >= 0 && j < arr2.length) {
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(sum - x);

            // Agar yeh pair pehle wale se zyada close hai, update karo
            if (diff < minDiff) {
                minDiff = diff;
                result = new ArrayList<>(Arrays.asList(arr1[i], arr2[j]));
            }

            if (sum == x) {
                return result; // Perfect match,  return
            } else if (sum < x) {
                j++; // Sum badhaana hai
            } else {
                i--; // Sum ghatana hai
            }
        }

        return result;
    }
}