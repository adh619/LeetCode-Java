/*
 * Implement atoi which converts a string to an integer.
 */
 
class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() < 1) return 0;
        
        int sign = 1, index = 0;
        long sum = 0;
        str = str.trim();
        
        if(str.charAt(index) == '+') {
            sign = 1;
            index++;
        }
        else if(str.charAt(index) == '-'){
            sign = -1;
            index++;
        }
        
        for(int i = index; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return (int)sum * sign;
            }
            
            sum = sum * 10 + str.charAt(i) - '0';
            
            if(sign == 1 && sum >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && sum * (-1) <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        
        return (int)sum * sign;
    }
}
