class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> arr = new ArrayList<Float>();
        
        float ans = a/b;
        arr.add(ans);
        
        float reduced_ans = Float.parseFloat(String.format("%.3f", ans));
        arr.add(reduced_ans);
        return arr;
    }
}