class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        for(String w1:word1){
            sb1.append(w1);
        }
        StringBuilder sb2=new StringBuilder();
        for(String w2:word2){
            sb2.append(w2);
        }
        return sb1.compareTo(sb2)==0;
    }
}