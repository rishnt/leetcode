// User function Template for Java
class Solution {
    public List<String> sortRecords(List<String> employee, List<Integer> salary) {
       int n = employee.size();
    Integer[] idx = new Integer[n];

    // Fill indices 0..n-1
    for (int i = 0; i < n; i++) {
        idx[i] = i;
    }

    // Sort indices by salary, then name
    Arrays.sort(idx, (i, j) -> {
        if (salary.get(i).equals(salary.get(j))) {
            return employee.get(i).compareTo(employee.get(j));
        }
        return salary.get(i) - salary.get(j);
    });

    // Build result list using sorted indices
    List<String> result = new ArrayList<>();
    for (int i : idx) {
        result.add(employee.get(i));
    }

    return result;
    }
}
