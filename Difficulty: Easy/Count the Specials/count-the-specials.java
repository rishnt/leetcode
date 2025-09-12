class Solution {
    public int countSpecials(int k, List<Integer> arr) {
       HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
       int n = arr.size()/k;
       int count = 0;
       for(int i=0;i<arr.size();i++){
           h.put(arr.get(i),h.getOrDefault(arr.get(i),0)+1);
       }
       for(Integer num: h.keySet()){
           if(h.get(num)==n){
               count++;
           }
       }
       return count;
    }
}