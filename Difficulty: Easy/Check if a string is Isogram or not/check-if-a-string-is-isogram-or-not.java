

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
      HashMap<Character,Integer> h = new HashMap<Character,Integer>();
      
      for(int i=0;i<data.length();i++){
          h.put(data.charAt(i),h.getOrDefault(data.charAt(i),0)+1);
      }
     
     for(int i=0;i<data.length();i++){
         if(h.get(data.charAt(i))!=1){
             return false;
         }
     }
     return true;
    }
}