
class Solution {
    public void swapKth(List<Integer> arr, int k) {
      int temp = arr.get(k-1);
      arr.set(k-1,arr.get(arr.size()-k));
      arr.set(arr.size()-k,temp);
       
    }
}
