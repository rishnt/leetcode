// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
      Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : s1.toCharArray()) set1.add(c);
        for (char c : s2.toCharArray()) set2.add(c);

        // Find symmetric difference
        Set<Character> result = new HashSet<>(set1);
        result.addAll(set2);     // union
        Set<Character> common = new HashSet<>(set1);
        common.retainAll(set2);  // intersection
        result.removeAll(common); // remove common chars

        // Build sorted string
        List<Character> sorted = new ArrayList<>(result);
        Collections.sort(sorted);

        StringBuilder ans = new StringBuilder();
        for (char c : sorted) ans.append(c);
        return ans.toString().isEmpty() ? "" : ans.toString();
    }
}