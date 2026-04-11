// User function Template for Java
class Solution {
    static String isSumOfTwo(int N) {
     if(N%2!=0){
         if(isPrime(N-2)){
             return "Yes";
         }
         return "No";
     }
     
     for(int i=2;i<=N/2;i++){
         if(isPrime(i) && isPrime(N-i)){
             return "Yes";
         }
     }
     return "No";
    }
    
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}