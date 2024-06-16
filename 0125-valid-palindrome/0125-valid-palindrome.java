class Solution {
    public boolean isPalindrome(String s) {
        String s2=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l=0,r=s2.length()-1;
        while(l<r){
            if(s2.charAt(l)!=s2.charAt(r)){
               return false;
            }
            l++;
            r--;
        }
        return true;
    }
}