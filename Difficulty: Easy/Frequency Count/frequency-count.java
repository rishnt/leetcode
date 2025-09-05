class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                a.add(h.get(arr[i]));
                h.remove(arr[i]);
            }
        }
        return a;
    }
}