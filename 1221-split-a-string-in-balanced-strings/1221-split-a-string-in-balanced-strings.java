class Solution {
    public int balancedStringSplit(String s) {
        int r=0,l=0,count=0,i=0;
        while(i<s.length()){
            if(s.charAt(i)=='R'){
                r++;
            }
            else{l++;
                }
        if(r==l){count++; }
            i++;
    }
    return count;
    }
}