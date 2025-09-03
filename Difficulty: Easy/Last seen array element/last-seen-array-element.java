// User function Template for Java

class Solution {

    public static int lastSeenElement(int arr[]) {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++){
           h.put(arr[i],i);
        }
        
        for(int i=0;i<arr.length;i++){
            int index = h.get(arr[i]);
            if(index == i){
                return arr[i]; 
            }
        }
        return -1;
    }
}
