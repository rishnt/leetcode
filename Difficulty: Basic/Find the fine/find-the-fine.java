// User function Template for Java

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
      long f = 0;
      for (int i = 0; i < car.length; i++) {
        if (date % 2 == 0 && car[i] % 2 != 0) {
            f += fine[i];
        } else if (date % 2 != 0 && car[i] % 2 == 0) {
            f += fine[i];
        }
    }
    return f;
    }
}