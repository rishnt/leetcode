// User function Template for Java

class Solution {
    int isPanagram(String S) {
        S=S.toLowerCase();
        int[] alphabets = new int[26];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==' ') continue;
           if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
    alphabets[S.charAt(i) - 'a']++;
}
        }
        for(int i=0;i<26;i++){
            if(alphabets[i]==0){
                return 0;
            }
        }
        return 1;
    }
};