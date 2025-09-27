class Solution {
    static List<Integer> get(int a, int b) {
        // code here
    ArrayList<Integer> ar = new ArrayList<Integer>();
    int temp = a;
    a=b;
    b=temp;
    ar.add(a);
    ar.add(b);
    return ar;
    }
}