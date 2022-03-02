// { Driver Code Starts
import java.util.*;
class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(a, b, n));
        }
    }
}// } Driver Code Ends


/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[], int n) {
        int sum1=0;
        int sum2=0;
        int k=0;
for(int i=0;i<n;i++){
  sum1+=a[i];
}
for(int j=0;j<n-1;j++){
    sum2+=b[j];
}
int ind=sum1-sum2;
for(int i=0;i<n;i++){
    if(a[i]==ind)
        k=i;
    
}
      return k;  
    }
}