// User function Template for Java

class Solution {
    int isdivisible7(String num) {
       int remainder = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % 7;
        }
        return (remainder == 0) ? 1 : 0;
    }
}