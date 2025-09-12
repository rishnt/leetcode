// User function Template for Java

class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> scores(int arr1[], int arr2[]) {
       int skill1 = 0;
       int skill2 = 0;
       for(int i=0;i<arr1.length;i++){
           if(arr1[i]>arr2[i]){
               skill1++;
           }
           else if(arr1[i]<arr2[i]){
               skill2++;
           }
       }
       
       ArrayList<Integer> result = new ArrayList<>();
    result.add(skill1);
    result.add(skill2);
    
    return result;
    }
}
