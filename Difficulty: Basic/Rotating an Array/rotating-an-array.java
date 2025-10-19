// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
    d=d%arr.length;
    
    reverse(arr,0,d-1);
    reverse(arr,d,arr.length-1);
    reverse(arr,0,arr.length-1);
        
    }
    
    void reverse(int arr[], int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r]=temp;
            l++;
            r--;
            }
    }
}
