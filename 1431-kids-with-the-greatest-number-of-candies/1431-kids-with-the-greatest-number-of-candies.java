class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        
        for(int candy:candies){
            if(candy+extraCandies>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}