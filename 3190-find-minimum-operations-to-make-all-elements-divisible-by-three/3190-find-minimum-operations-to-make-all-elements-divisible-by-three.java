class Solution {
    public int minimumOperations(int[] nums) {
        int output=0;
        for(int i:nums){
            if(i%3!=0){
                output++;
        }
    }
        return output;
    }
}