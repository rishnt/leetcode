class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int min_time = Integer.MAX_VALUE;
        for(int i=0;i<pos.length;i++){
            int t = Math.abs(pos[i]-cur)*time[i];
            min_time = Math.min(min_time,t);
        }
        return min_time;
    }
}
