class GfG {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
    //   Stack<Integer> st = new Stack<Integer>();
    //   if(k<q.size()){
    //          for(int i=0;i<k;i++){
    //       st.push(q.get(i));
    //   }
    //   for(int i=k-1;i>=0;i--){
    //       q.set(i,st.pop());
    //   }
    //   }
    //   else{
    //       int start = 0;
    //       int end = q.size()-1;
    //       while(start<end){
    //           int temp = q.get(start);
    //           q.set(start) = q.get(end);
    //           q.set(end) = temp;
    //       }
    //   }
    //  return q;
       Stack<Integer> st = new Stack<>();

        // Step 1: Push first k elements into stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());  // remove from front
        }

        // Step 2: Enqueue stack elements back (reversed order)
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move remaining (n-k) elements to rear to maintain order
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }

        return q;
    }
}