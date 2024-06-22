class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=0;
        for(String sentence:sentences){
            String[] words=sentence.split(" ");
            if(words.length>len){
                len=words.length;
            }
        }
        return len;
    }
}