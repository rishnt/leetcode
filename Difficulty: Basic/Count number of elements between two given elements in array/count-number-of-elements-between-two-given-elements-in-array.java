class Solution {
    // Function to get the count of elements between num1 and num2 in array arr.
    public int getCount(ArrayList<Integer> arr, int num1, int num2) {
     int left = -1;
     for(int i=0;i<arr.size();i++){
         if(arr.get(i)==num1){
             left = i;
             break;
         }
     }
     
     int right = -1;
     for(int i=arr.size()-1;i>=0;i--){
           if(arr.get(i)==num2){
             right = i;
             break;
         }
     }
     
     if(left<right){
         return right-left-1;
     }
   
     return 0;
    }
}