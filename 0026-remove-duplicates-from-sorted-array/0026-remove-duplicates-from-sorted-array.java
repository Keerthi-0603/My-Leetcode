import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int c=0;
       
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}