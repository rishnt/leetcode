class Solution {
    public List<String> validParenthesis(String s) {
        // code here
            Set<String> ans = new HashSet<>();
        
        // Queue for BFS traversal
        Queue<String> q = new LinkedList<>();
        
        q.offer(s);
        
        // To avoid processing same string again
        Set<String> visited = new HashSet<>();
        visited.add(s);
        
        boolean found = false;
        
        while (!q.isEmpty()) {
            
            String curr = q.poll();
            
            // If current string is valid
            if (isValid(curr)) {
                ans.add(curr);
                found = true;
            }
            
            // Once we find valid strings at current level,
            // no need to go deeper because we need
            // minimum removals only.
            if (found) continue;
            
            // Remove one parenthesis at every position
            for (int i = 0; i < curr.length(); i++) {
                
                char ch = curr.charAt(i);
                
                // Skip non-parenthesis characters
                if (ch != '(' && ch != ')')
                    continue;
                
                // Create new string after removing current char
                String next = curr.substring(0, i) + curr.substring(i + 1);
                
                // Process only unvisited strings
                if (!visited.contains(next)) {
                    visited.add(next);
                    q.offer(next);
                }
            }
        }
        
        // Convert set to list and sort lexicographically
        List<String> res = new ArrayList<>(ans);
        Collections.sort(res);
        
        return res;
    }
    
    // Function to check if parentheses string is valid
    private boolean isValid(String s) {
        
        int count = 0;
        
        for (char ch : s.toCharArray()) {
            
            if (ch == '(') {
                count++;
            } 
            else if (ch == ')') {
                
                // Closing bracket before opening
                if (count == 0)
                    return false;
                
                count--;
            }
        }
        
        // Valid only if all opening brackets are matched
        return count == 0;
    }
}