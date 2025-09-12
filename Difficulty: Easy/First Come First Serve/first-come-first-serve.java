// User function Template for Java

class Solution {

    static int firstElement(int arr[], int k) {
       HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
       for(int i=0;i<arr.length;i++){
           h.put(arr[i],h.getOrDefault(arr[i],0)+1);
       }
       for(int i=0;i<arr.length;i++){
           if(h.get(arr[i])==k){
               return arr[i];
           }
       }
       return -1;
    }
}