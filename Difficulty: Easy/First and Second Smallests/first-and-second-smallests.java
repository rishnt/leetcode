class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            smallest = Math.min(smallest,arr[i]);
         
        }
        
        for(int i=0;i<arr.length;i++){
                 if(arr[i]>smallest && arr[i]<second_smallest){
             second_smallest = arr[i];
         }
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        if(second_smallest == Integer.MAX_VALUE){
            // ar.add(smallest);
             ar.add(-1); 
        }
       else{
           ar.add(smallest);
           ar.add(second_smallest);
       }
        return ar;
    }
}
