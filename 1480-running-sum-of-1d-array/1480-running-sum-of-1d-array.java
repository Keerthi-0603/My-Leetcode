class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int r=0;
        for(int i=0;i<nums.length;i++){
            r=r+nums[i];
            sum[i]=r;
        }
        return sum;
    }
}