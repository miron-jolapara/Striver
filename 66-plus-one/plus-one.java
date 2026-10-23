class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;

        if(digits[len] != 9) {
            digits[len]++;
            return digits;
        } else {
            while(len >= 0 && digits[len] == 9) {
                digits[len] = 0;
                len--;
            }

            if(len >= 0) {
                digits[len]++;
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}