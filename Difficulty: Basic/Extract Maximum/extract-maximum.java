// User function Template for Java

class Solution {
    static int extractMaximum(String S) {
        // code here
        String[] numbers = S.split("[^0-9]+"); 
        int maxNum = -1;
        boolean found = false;

        for (String num : numbers) {
            if (!num.isEmpty()) {
                int value = Integer.parseInt(num); 
                maxNum = Math.max(maxNum, value);
                found = true;
            }
        }
        return found ? maxNum : -1;
    }
}
