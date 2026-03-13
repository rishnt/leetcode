class Solution {
    public ArrayList<String> generateIp(String s) {
        // code here
          if (s.length() > 12 || s.length() < 4) return new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        func(0, s, "", "", ans, 0);
        return ans;
    }
     void func(int ind, String s, String num, String ip, ArrayList<String> ans, int cnt) {
        //if more than four segements
        if (cnt > 4) return;
        //if all digits covered
        if (ind == s.length()) {
            //123.456.567.789.""
            if (cnt == 4 && num.equals("")) {
                // remove last dot
                ans.add(ip.substring(0, ip.length() - 1)); 
                
            }
            return;
        }
        
            num += s.charAt(ind);
        // check leading zero if present, return
        if (num.length() > 1 && num.charAt(0) == '0') return;
        if (Integer.parseInt(num) <= 255) {
            // continue building current segment
            func(ind + 1, s, num, ip, ans, cnt);
            // finish current segment and start next
            func(ind + 1, s, "", ip + num + ".", ans, cnt + 1);
        }
     }
}