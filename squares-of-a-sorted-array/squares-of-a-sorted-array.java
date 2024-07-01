class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares=new int[nums.length];
        for(int i=0;i<squares.length;i++){
            squares[i]=nums[i]*nums[i];
        }
        Arrays.sort(squares);
        return squares;
    }
}