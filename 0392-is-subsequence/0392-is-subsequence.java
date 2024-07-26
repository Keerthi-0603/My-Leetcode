class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0,r=0;
        while(l<s.length() && r<t.length() ){
            char ch_l=s.charAt(l);
            char ch_r=t.charAt(r);
            if(ch_l==ch_r){
                l++;
                r++;
            }
            else{
                r++;
            }
        }
        return l==s.length();
    }
}