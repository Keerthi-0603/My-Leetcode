class Solution {
    boolean isVow(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
    
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = s.length() - 1;
        
        while (l < r) {
            // Move l pointer to the right until it points to a vowel
            while (l < r && !isVow(chars[l])) {
                l++;
            }
            
            // Move r pointer to the left until it points to a vowel
            while (l < r && !isVow(chars[r])) {
                r--;
            }
            
            // Swap vowels
            if (l < r) {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            }
        }
        
        return new String(chars);
    }
}
