// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

     int[] ch=new int[26];
     for(int i=0;i<s1.length();i++){
         ch[s1.charAt(i)-'a']++;
     }
     
     for(int i=0;i<s2.length();i++){
           ch[s2.charAt(i) - 'a']--;
        if (ch[s2.charAt(i) - 'a'] < 0) {
            return s2.charAt(i);
        }
     }
     return '\0';
    }
}
