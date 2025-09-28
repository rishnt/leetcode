
class Solution {
    public String longest(List<String> arr) {
        // code here
        String ans="";
        int length=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).length()>length){
                length = arr.get(i).length();
                ans = arr.get(i);
            }
        }
        return ans;
    }
}
