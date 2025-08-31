class Solution {
    public int findUnique(int k, int[] arr) {
        // code here
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        
        for(Integer value : h.keySet()){
            int num = h.get(value);
            if(num == 1)
            return value;
        }
        return -1;
    }
}