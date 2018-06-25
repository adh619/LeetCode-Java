/*
 * Given an input string, reverse the string word by word.
 */

public class Solution {
    public String reverseWords(String s) {
        if(s.length() < 1) return "";
        
        String[] words = s.split("\\s+");
        String result = "";
        for(int i = words.length - 1; i >= 0; i--){
            result += words[i] + " ";
        }
        
        return result.trim();
    }
}
