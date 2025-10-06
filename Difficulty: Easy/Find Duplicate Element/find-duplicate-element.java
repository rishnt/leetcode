// User function Template for Java
class Solution {

    public int findDuplicate(int arr[]) {
   HashSet<Integer> h = new HashSet<Integer>();
   for(int i=0;i<arr.length;i++){
       if(h.contains(arr[i])){
           return arr[i];
       }
       else{
           h.add(arr[i]);
       }
   }
   return -1;
    }
}