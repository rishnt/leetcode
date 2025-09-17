class Solution {
    public int findKRotation(int arr[]) {
        int index_highest =0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index_highest = i+1;
            }
        }
        return index_highest%arr.length;
    }
}