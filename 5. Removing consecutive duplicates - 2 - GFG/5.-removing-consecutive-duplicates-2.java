// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Reading number of testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		   //Reading the string that needs to processed
		   String str = br.readLine().trim();
		   
		   //calling the removePair method of class solve
		   String ans=new Solution().removePair(str);
		   
		   //if the new processed string is empty
		   //then we print "Empty String"
		   if(ans.length()<=0)
		   System.out.println("Empty String");
		   
		   //otherwise we print the new string
		   else
		   System.out.println(ans);
		}
	}
}// } Driver Code Ends




class Solution
{
    //Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str)
    {
        Stack<Character> st=new Stack<Character>();
        String s="";
        String r="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(st.isEmpty()||st.peek()!=ch){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        if(st.isEmpty()){
            return "Empty String";
        }
        while(!st.isEmpty()){
            s+=st.peek();
            st.pop();
        }
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;
    }
}