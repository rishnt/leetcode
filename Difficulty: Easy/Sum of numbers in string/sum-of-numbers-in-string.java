class Solution {
    public int findSum(String s) {
       int sum =0;
       String num="";
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if(Character.isDigit(ch)){
               num+=ch;
           }
           else{
               if(!num.equals("")){
                   sum+=Integer.parseInt(num);
                   num = "";
               }
           }
       }
        if (!num.equals("")) {
            sum += Integer.parseInt(num);
        }
       return sum;
    }
}