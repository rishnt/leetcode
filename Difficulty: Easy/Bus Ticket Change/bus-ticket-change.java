class Solution {
    public boolean canServe(int[] arr) {
     int five = 0, ten = 0; // track available 5s and 10s

    for (int bill : arr) {
        if (bill == 5) {
            five++;
        } else if (bill == 10) {
            if (five > 0) {
                five--;
                ten++;
            } else {
                return false; // no 5 to give as change
            }
        } else { // bill == 20
            if (ten > 0 && five > 0) {
                ten--;
                five--;
            } else if (five >= 3) {
                five -= 3;
            } else {
                return false; // not enough change
            }
        }
    }
    return true;
    }
}