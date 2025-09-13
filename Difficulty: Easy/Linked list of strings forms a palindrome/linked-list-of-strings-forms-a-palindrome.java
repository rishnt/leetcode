class Solution {
    public boolean compute(Node root) {
        StringBuilder s = new StringBuilder();
        Node temp =root;
        while(temp!=null){
            s.append(temp.data);
            temp=temp.next;
        }
        
        int j=s.length()-1;
        int i=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}