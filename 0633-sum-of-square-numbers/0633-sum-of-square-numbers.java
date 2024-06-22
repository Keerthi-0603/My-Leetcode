class Solution {
    public boolean judgeSquareSum(int c) {
        int r=0,l=(int) Math.sqrt(c);
        while(r<=l){
            long sum=(long) r*r+(long) l*l;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                r++;
            }
            else{
                l--;
            }
        }
        return false;
    }
}