class Solution {
    int sumExceptFirstLast(int[] arr) {
        // your code here
        if(arr.length<=2) return 0;
        int sum = 0;
        for(int i=1;i<arr.length-1;i++){
            sum+=arr[i];
        }
        return sum;
    }
}