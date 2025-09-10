// User function Template for Java

class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        Stack<Integer> st = new Stack<Integer>();
      int size = s.size();
      for(int i=0;i<size/2;i++){
          st.push(s.pop());
      }
        s.pop();
        for(int i=0;i<size/2;i++){
          s.push(st.pop());
      }
    }
}
