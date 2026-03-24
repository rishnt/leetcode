class Solution {
    public ArrayList<Integer> minHeightRoot(int V, int[][] edges) {
        // Code here
         HashMap<Integer, List<Integer>> adj = new HashMap<>();
        var indegree = new int[V];
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
            
            indegree[u]++;
            indegree[v]++;
        }
        
        var q = new ArrayDeque<Integer>();
        
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 1)
                q.offer(i);
        }
        
        while (V > 2) {
            int s = q.size();
            V -= s;
            
            for (int x = 0; x < s; x++) {
                int node = q.poll();
                
                for (int neigh : adj.get(node)){
                    if (--indegree[neigh] == 1)
                        q.offer(neigh);
                }
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while (!q.isEmpty()) {
            int top = q.poll();
            ans.add(top);
        }
        
        return ans;
    }
}