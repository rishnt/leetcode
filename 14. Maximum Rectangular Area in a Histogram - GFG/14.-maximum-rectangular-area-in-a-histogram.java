// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
       /* Stack<Long> s=new Stack<Long>();
        long res=0;
        long cur=0;
        for(long i=0;i<n;i++){
            while(s.isEmpty()==false&&hist[s.peek()]>=hist[i]){
                long tp=s.peek();
                s.pop();
                if(s.isEmpty()){
                    cur=hist[tp]*i;
                }
                else{
                    cur=hist[tp]*(i-s.peek()-1);
                }
                res=Math.max(res,cur);
            }
            s.puch(i);
        }
        while(!s.isEmpty()){
            long tp=s.peek();
            s.pop();
            if(s.isEmpty()){
                cur=hist[tp]*n;
            }
            else{
                cur=hist[tp]*(n-s.peek()-1);
            }
            res=Math.max(res,curr);
        }
        return res*/
        
        long []rb = new long[ (int)n];
Stack<Integer> st = new Stack<>();
rb[(int)n - 1] = n;
st.push( (int)n - 1 );
for(int i = (int)n - 2; i >= 0; i--){
while( st.size() != 0 && hist[i] <= hist[st.peek()] ){
st.pop();
}
if( st.size() == 0 ){
rb[(int)i] = n;
}else{
rb[(int)i] = st.peek();
}
st.push(i);
}
long [] lb = new long[ (int)n];
st = new Stack<>();
lb[(int)0] = -1;
st.push(0);
for(int i = 1; i < n; i++){
while( st.size() != 0 && hist[i] <= hist[st.peek()] ){
st.pop();
}
if( st.size() == 0 ){
lb[(int)i] = -1;
}else{
lb[(int)i] = st.peek();
}
st.push(i);
}
long max = 0;
for(int i = 0; i < n; i++){
long width = rb[i] - lb[i] - 1;
long area = hist[i] * width;
max = Math.max( max, area );
}
return max;
    }
}



