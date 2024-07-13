class Solution {
    public int[] twoSum(int[] nums, int target) {
        int r=nums.length-1,l=0;
        while(l<r){
            if(nums[r]+nums[l]==target){
                return new int[]{l,r};
            }
            r--;
            if(r==l){
                l++;
                r=nums.length-1;
            }
        }
        return new int[]{-1,1};
    }
}