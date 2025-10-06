class Solution {
    public int findElement(int[] arr) {
      
    //   int number = -1;
    //   int[] leftB = new int[arr.length];
    //   int[] rightS = new int[arr.length];
    //   leftB[0] = arr[0];
    //   for(int i=1;i<arr.length;i++){
    //       leftB[i] = Math.max(leftB[i-1],arr[i]);
    //   }
      
    //   rightS[arr.length-1]=arr[arr.length-1];
    //   for(int i=arr.length-2;i>0;i--){
    //       rightS[i]=Math.min(rightS[i+1],arr[i]);
    //   }
      
    //   for(int i=0;i<arr.length;i++){
    //       if(leftB[i]==rightS[i]){
    //           number =arr[i];
    //           break;
    //       }
    //   }
    //   return number;
    
    int n = arr.length;
    if (n < 3) return -1; // cannot have both left & right

    int[] leftB = new int[n];
    int[] rightS = new int[n];

    leftB[0] = arr[0];
    for (int i = 1; i < n; i++) {
        leftB[i] = Math.max(leftB[i - 1], arr[i]);
    }

    rightS[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightS[i] = Math.min(rightS[i + 1], arr[i]);
    }

    for (int i = 1; i < n - 1; i++) {
        if (leftB[i - 1] < arr[i] && rightS[i + 1] > arr[i]) {
            return arr[i];
        }
    }

    return -1;
    }
}
