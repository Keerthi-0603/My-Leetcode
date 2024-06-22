class Solution {
    public int countValidWords(String sentence) {
        int total=0;
        String[] words=sentence.split("\\s+");
        for(String word:words){
            if(isValid(word)){
                total++;
            }
        }
        return total;
    }
    
    boolean isValid(String word){
        int h_count=0,p_count=0;
        if(word.isEmpty()){
            return false;
        }
        else{
            for(int i=0;i<word.length();i++){
                char c=word.charAt(i);
                if(Character.isDigit(c)){
                    return false;
                }
                
                if(c=='-'){
                    h_count++;
                    if(h_count>1 || i==0 || i==word.length()-1 || !Character.isLowerCase(word.charAt(i-1)) || !Character.isLowerCase(word.charAt(i+1))){
                        return false;
                    }
                }
                
                else if(c == '!' || c == '.' || c == ',')
                {
                    p_count++;
                    if(p_count>1 || i != word.length()-1){
                        return false;
                    }
                }
                
                else{
                    if(!Character.isLowerCase(c))
                    {
                        return false;
                    }
                }                                                           
            }
            return true;
        }
    }
}