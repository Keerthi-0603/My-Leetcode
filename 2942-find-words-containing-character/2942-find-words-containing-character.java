class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> res=new ArrayList();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(Character.toString(x))){
                res.add(i);
            }
        }
        return res;
    }
}