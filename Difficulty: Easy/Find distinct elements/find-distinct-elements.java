// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        return h.size();
    }
}