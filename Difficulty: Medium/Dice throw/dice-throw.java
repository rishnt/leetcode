class Solution {
    static int noOfWays(int m, int n, int x) {
              long[] prev = new long[x + 1];

       

 

        // Base case: 0 dice, 0 sum = 1 way

        prev[0] = 1;

 

        for (int i = 1; i <= n; i++) {

            long[] curr = new long[x + 1];

            long windowSum = 0;

            

            for (int j = 1; j <= x; j++) {

                // Add the new possible face value from the previous dice

                windowSum = (windowSum + prev[j - 1]);

                

                // Remove the face value that is now out of range (j - M - 1)

                if (j > m) {

                    windowSum = (windowSum - prev[j - m - 1]);

                }

                

                curr[j] = windowSum;

            }

            prev = curr;

        }

 

        return (int) prev[x];
    }
};