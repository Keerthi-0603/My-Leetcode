class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> res=new ArrayList();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   res.add(nums1[i]);
                    nums2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
       int[] resultArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultArray[i] = res.get(i);
        }

        return resultArray;
    }
}