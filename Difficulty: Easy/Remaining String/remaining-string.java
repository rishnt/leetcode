class Solution {
    public String printString(String s, char ch, int count) {
        int occurrence=0;
        for(int i=0;i<s.length()-1;i++){
           if (s.charAt(i) == ch) {
            occurrence++;
            if (occurrence == count) {
                // Return everything after this character
                if (i + 1 < s.length()) {
                    return s.substring(i + 1);
                } else {
                    // nothing remains after
                    return "";
                }
            }
        }
        }
        return "";
    }
}