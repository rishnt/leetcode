class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int i=0, j=arr.length-1, lsum=arr[i], rsum=arr[j];
        
        if(arr.length==1)
            return false;
        
        while(i<j-1){
            if(lsum>rsum){
                j--;
                rsum+= arr[j];
            }
            else{
                i++;
                lsum+=arr[i];
            }
        }
        
        if(lsum==rsum)
            return true;
        return false;
    }
}