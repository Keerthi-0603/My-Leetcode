class Solution {
    public boolean isPalindrome(int x) {
        int d=0,r;
        int o=x;
        while(x>0){
            r=x%10;
            d=d*10+r;
            x=x/10;
        }
        if(d==o){
            return true;
        }
        else{
            return false;
        }
    }
}