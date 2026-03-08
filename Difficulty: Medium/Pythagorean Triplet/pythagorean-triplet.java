class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]*arr[i]);
        }
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(h.contains(arr[i]*arr[i]+arr[j]*arr[j])){
                    return true;
                }
            }
        }
        return false;
    }
}