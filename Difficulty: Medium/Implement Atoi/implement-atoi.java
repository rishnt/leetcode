class Solution {
    public int myAtoi(String s) {
        // code here
         int n = s.length();
        int i = 0;

        while (i < n && s.charAt(i) == ' ') i++;

        if (i == n) return 0;

        int sign = 1;
        char c = s.charAt(i);
        if (c == '+' || c == '-') {
            sign = (c == '-') ? -1 : 1;
            i++;
        }

        long result = 0;
        boolean foundDigit = false;
        while (i < n) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) break;
            foundDigit = true;
            int digit = ch - '0';

            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        if (!foundDigit) return 0;

        result = result * sign;
        return (int) result;
    }
}