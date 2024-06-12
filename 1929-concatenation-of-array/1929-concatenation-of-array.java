class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int[] res=new int[n];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
            res[i+nums.length]=nums[i];
        }
        return res;
    }
}