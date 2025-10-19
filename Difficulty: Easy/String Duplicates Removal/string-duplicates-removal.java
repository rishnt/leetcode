// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
  StringBuilder ans = new StringBuilder();
  HashSet<Character> h =new HashSet<Character>();
  for(int i=0;i<s.length();i++){
      if(!h.contains(s.charAt(i))){
          ans.append(s.charAt(i));
            h.add(s.charAt(i));
      }
  }
  return String.valueOf(ans);
    }
}
