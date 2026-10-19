class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        int i = 0;
        int sign = 1;

        while(i < len && s.charAt(i) == ' ')
            i++;

        if(i < len && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if(i < len && s.charAt(i) == '+') {
            i++;
        }

        int result = 0;

        while(i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            if(result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}