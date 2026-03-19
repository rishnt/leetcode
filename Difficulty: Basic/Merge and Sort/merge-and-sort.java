class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int n1 = arr1.length, n2 = arr2.length;
    int i=0,j=0;
    while(i<n1 && j<n2){
        if(arr1[i]<arr2[j]){
            if(!ans.contains(arr1[i])){
                ans.add(arr1[i]);
            }
            i++;
        }
        else{
            if(!ans.contains(arr2[j])){
                ans.add(arr2[j]); 
            }
            j++;
        }
    }
    
    if(i<n1){
        while(i<n1){
          if(!ans.contains(arr1[i])){
                ans.add(arr1[i]);
            }
            i++;
        }
    }
    
    if(j<n2){
        while(j<n2){
           if(!ans.contains(arr2[j])){
                ans.add(arr2[j]); 
            }
            j++;
        }
    }
        return ans;
    }
}
