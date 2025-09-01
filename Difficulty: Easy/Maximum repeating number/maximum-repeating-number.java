// User function Template for Java

class Solution {
    int maxRepeating(int k, int[] arr) {
        int[] a = new int[k];
        if(k==1) return arr[0];
        for(int i=0;i<arr.length;i++){
            a[arr[i]]++;
        }
        int result =0;
        for(int i=0;i<k;i++){
            if(a[i]>a[result]){
                result = i;
            }
        }
        return result;
    }
}