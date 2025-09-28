class Solution {

    void printTriangle(int n) {
        // code here
      
        for(int i=0;i<n;i++){
            int t=n-i;
            for(int j=0;j<t;j++){
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }
}