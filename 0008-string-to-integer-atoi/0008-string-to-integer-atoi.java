class Solution {
    public int myAtoi(String s) {

        long sign = 1;
        long ans = 0;
        int i = 0;
        if(s.length()==0){
            return 0;
        }
        
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        
        if(i < s.length() && s.charAt(i) == '-'){
            i++;
            sign = -1;
        }
        else if(i < s.length() && s.charAt(i) == '+'){
            i++;
        }

        if(i < s.length() && Character.isDigit(s.charAt(i))){
            while(i < s.length() && Character.isDigit(s.charAt(i)) ){
                int digit = s.charAt(i) - '0';

                if (ans > (Long.MAX_VALUE - digit) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                ans = ans * 10 + digit;
                i++;
            }
        }else{
            return 0;
        }
        
        if(sign == -1 && ans >= (long)Integer.MAX_VALUE +1){
            return Integer.MIN_VALUE ;
        }
        else if(ans > Integer.MAX_VALUE ){
            return Integer.MAX_VALUE ;
        }
        
        return (int)(sign * ans);
    }
}