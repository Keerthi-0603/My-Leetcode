class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            String item=Integer.toString(i);
            int size=item.length();
            if(size%2==0){
                count++;
            }
        }
        return count;
    }
}