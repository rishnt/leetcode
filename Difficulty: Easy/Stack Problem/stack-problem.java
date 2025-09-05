// User function Template for Java

class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
       Stack<Integer> s= new Stack<Integer>();
       int size = n/2;
       int i=0;
       while(i<size){
           s.push(st.pop());
           i++;
       }
       st.pop();
       while(!s.isEmpty()){
           st.push(s.pop());
       }
       return st;
    }
}