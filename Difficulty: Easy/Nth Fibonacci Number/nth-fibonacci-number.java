class Solution {
    public int nthFibonacci(int n) {
       if(n==0) return 0;
       if(n==1) return 1;
       
       int a=0,b=1,num=0;
       for(int i=2;i<=n;i++){
           num = a+b;
           a=b;
           b=num;
       }
       return num;
    }
}