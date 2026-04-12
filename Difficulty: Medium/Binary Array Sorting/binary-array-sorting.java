class Solution {
    public void binSort(int[] arr) {
       int j = 0; // position for next 0

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }
}
}
