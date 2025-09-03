// User function Template for Java

class Solution {
    int countElements(int[] arr) {
         int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    HashSet<Integer> set = new HashSet<>();

    for (int num : arr) {
        max = Math.max(num, max);
        min = Math.min(num, min);
        set.add(num);
    }

    return (max - min + 1) - set.size();
    }
}