class Solution {
    public int countElements(int[] arr) {
        // code here
        int count=1;
        int max = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                count++;
                max=arr[i];
            }
        }
        return count;
    }
}
