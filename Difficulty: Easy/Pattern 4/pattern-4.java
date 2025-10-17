class Solution {

    void printTriangle(int n) {
        // code here
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
            }
            System.out.println();
            k++;
        }
    }
}