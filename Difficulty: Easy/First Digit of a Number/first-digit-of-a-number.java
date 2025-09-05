class Solution {
    public static int firstDigit(int n) {
    int ans = 0;
    while(n>=10){
     ans = n/10;
    n = n/10;
    }
    
    if(n<10){
        return n;
    }
        return ans;
    }
}