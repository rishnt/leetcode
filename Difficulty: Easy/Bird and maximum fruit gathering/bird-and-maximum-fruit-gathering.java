class Solution {
    public int maxFruits(int[] arr, int totalTime) {
        // code here
        int max_fruits = 0,fruits=0;
        if(arr.length>totalTime){
        for(int i=0;i<totalTime;i++){
          fruits+=arr[i];
    }
    max_fruits = fruits;
    for(int i=totalTime;i<arr.length;i++){
       fruits = fruits-arr[i-totalTime]+arr[i];
       max_fruits = Math.max(fruits,max_fruits);
    }
        }
        else{
            for(int i=0;i<arr.length;i++){
                max_fruits +=arr[i];
            }
        }
    return max_fruits;
    }
}
