/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 */

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char letter : s.toCharArray()){
            if(map.containsKey(letter)){
                map.put(letter, map.get(letter) + 1);
            }
            else{
                map.put(letter, 0);
            }
        }
        
        for(char letter : s.toCharArray()){
            if(map.get(letter) == 0){
                return s.indexOf(letter);
            }
        }
        
        return -1;
    }
}
