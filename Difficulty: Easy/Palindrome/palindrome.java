class Solution {
    public boolean isPalindrome(int n) {
     int num =0, c = n;
     while(n>0){
         int temp = n%10;
         num = num*10 +temp;
         n=n/10;
     }
        if(c==num){
            return true;
        }
        return false;
    }
}