class Solution {
    public int[] findBuildings(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int max=heights[heights.length-1];
        stack.push(heights.length-1);
        for(int i=heights.length-2;i>=0;i--){
            if(heights[i]>max){
                max=heights[i];
                stack.push(i);
            }
        }
        int[] result=new int[stack.size()];
        int idx=0;
        while(!stack.isEmpty()){
            result[idx]=stack.pop();
            idx++;
        }
        Arrays.sort(result);
        return result;
    }
}