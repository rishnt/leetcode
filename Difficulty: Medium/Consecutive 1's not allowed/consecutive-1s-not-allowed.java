class Solution {
    int countStrings(int n) {
        // code here
         int ind = n+1;
        return fibo(ind);
    }
    

 int fibo(int N){
        if(N==0) return 0;
        int prev = 1;
        int sum=1;
        for(int i=2;i<=N;i++){
            int temp = sum;
            sum+=prev;
            prev = temp;
        }
        return sum;
    }
}