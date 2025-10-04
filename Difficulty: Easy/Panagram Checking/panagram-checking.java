class Solution {
    public static boolean checkPangram(String s) {
       int[] ch = new int[26];
       s = s.toLowerCase();
       for(int i=0;i<s.length();i++){
          char c = s.charAt(i);
        if (c >= 'a' && c <= 'z') {  // only count alphabets
            ch[c - 'a']++;
        }
       }
       
       for(int i=0;i<ch.length;i++){
           if(ch[i]==0)
           return false;
       }
       return true;
    }
}