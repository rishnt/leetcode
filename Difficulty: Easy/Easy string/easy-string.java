// User function Template for Java
class Solution {
    String transform(String S) {
       
       S= S.toLowerCase();
       String ans = "";
       int count=1;
       for(int i=1;i<S.length();i++){
           if(S.charAt(i)!=S.charAt(i-1)){
               ans+=String.valueOf(count)+S.charAt(i-1);
               count=1;
           }
           else{
               count++;
           }
       }
       if(S.charAt(S.length()-1)!= S.charAt(S.length()-1)){
           ans+=String.valueOf(1)+S.charAt(S.length()-1);
       }
       else{
           ans+=String.valueOf(count)+S.charAt(S.length()-1);
       }
       return ans;
    }
}