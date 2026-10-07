class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();

        if((num.charAt(len - 1) - '0') % 2 != 0)
            return num;

        len -= 1;

        while(len >= 0) {
            int curr = num.charAt(len) - '0';

            if(curr % 2 != 0) {
                return num.substring(0, len + 1);
            }

            len--;
        }

        return "";
    }
}