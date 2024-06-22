class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (word.length() <= 2) {
                // Convert all letters to lowercase for words with 1 or 2 characters
                word = word.toLowerCase();
            } else {
                // Capitalize the first letter and convert the rest to lowercase
                word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }
            
            // Append the modified word to StringBuilder
            sb.append(word);
            
            // Append space if it's not the last word
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}