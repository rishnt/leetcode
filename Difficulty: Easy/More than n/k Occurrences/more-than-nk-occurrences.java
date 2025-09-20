class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
       HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
       int n = arr.length/k;
       int count=0;
       for(int i=0;i<arr.length;i++){
           h.put(arr[i],h.getOrDefault(arr[i],0)+1);
       }
       
       for(Integer num: h.keySet()){
           if(h.get(num)>n){
               count++;
           }
       }
       return count;
    }
}