// User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int min_distance = Integer.MAX_VALUE;;
        int index1=-1,index2=-1;
        for(int i=0;i<s.size();i++){
            if(s.get(i).equals(word1)) index1=i;
            if(s.get(i).equals(word2)) index2=i;
            
            if(index1!=-1 && index2!=-1){
                min_distance = Math.min(min_distance,Math.abs(index1-index2));
            }
        }
        return min_distance;
    }
};