class Solution {
    public String longestPalindrome(String s) {
        int startIndex = 0;
        int maxLen = 1;

        for(int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;

            // Odd-length palindrome
            while(left >= 0 && right < s.length() &&
                  s.charAt(left) == s.charAt(right)) {
                if(right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    startIndex = left;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            // Even-length palindrome
            while(left >= 0 && right < s.length() &&
                  s.charAt(left) == s.charAt(right)) {
                if(right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    startIndex = left;
                }
                left--;
                right++;
            }
        }

        return s.substring(startIndex, startIndex + maxLen);
    }
}