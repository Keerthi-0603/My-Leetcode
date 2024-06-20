class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int l=0,r=n;
        for(int i=0;i<n;i++){
            res[2*i]=nums[l];
            res[2*i+1]=nums[r];
            l++;
            r++;
        }
        return res;
    }
}