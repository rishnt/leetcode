class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();
    
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length && k < c.length) {
        
        // If all equal → common element
        if (a[i] == b[j] && b[j] == c[k]) {
            
            // avoid duplicates in result
            if (ans.size() == 0 || ans.get(ans.size()-1) != a[i]) {
                ans.add(a[i]);
            }
            
            i++; j++; k++;
        }
        else if (a[i] < b[j]) {
            i++;
        }
        else if (b[j] < c[k]) {
            j++;
        }
        else {
            k++;
        }
    }
    
    return ans;
    }
}