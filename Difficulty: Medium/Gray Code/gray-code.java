class Solution {
    public ArrayList<String> graycode(int n) {
        // code here
          ArrayList<String>ans=new ArrayList<>();

        for(int i=0;i<(1<<n);i++){

            int val=(i^(i>>1));

            StringBuilder sb=new StringBuilder();

            for(int j=n-1;j>=0;j--){

                if((val&(1<<j))!=0)

                sb.append('1');

                else

                sb.append('0');

            }

        

        ans.add(sb.toString());

        }

        return ans;
    }
}