// User function Template for Java

class Solution {
    int findSum(int arr[]) {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        int sum=0;
        for(Integer num: h){
            sum+=num;
        }
        return sum;
        
    }
}