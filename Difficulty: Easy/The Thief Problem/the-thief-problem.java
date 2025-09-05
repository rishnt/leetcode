// User function Template for Java

class Solution {
    public static int getMaxVal(int arr[], int k) {
        // Your code here
        
        Arrays.sort(arr);
        int max_robbery =0;
        if(k<=arr.length){
           for(int i=arr.length-1;i>=arr.length-k;i--){
               max_robbery+= arr[i];
           } 
        }
        else{
            for(int i=0;i<arr.length;i++){
                max_robbery+=arr[i];
            }
        }
        return max_robbery;
    }
}