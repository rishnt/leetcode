// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.ArrayList;
class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int hashSize = Integer.parseInt(br.readLine().trim());
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution obj = new Solution();
		    ArrayList<ArrayList<Integer>> res  = obj.separateChaining(arr, n, hashSize);
		    
		    for(int i=0;i<res.size();i++) {
	            if(res.get(i).size()>0) {
	                System.out.print(i+"->");
	                for(int j=0; j<res.get(i).size()-1; j++) {
	                    System.out.print(res.get(i).get(j) + "->");
	                }
	                System.out.print(res.get(i).get(res.get(i).size()-1));
	                System.out.println();
	            }
	        }
		}
	}
}

// } Driver Code Ends



class Solution{

    //Function to insert elements of array in the hashTable avoiding collisions.
    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
    {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
    
    for(int i=0;i <=hashSize;i++){
        al.add(new ArrayList<Integer>());
    }
    for(int i=0;i<n;i++){
        int j = arr[i]%hashSize;
        al.get(j).add(arr[i]);
    }
    return al;
    }
}