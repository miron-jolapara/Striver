class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength != tLength)
            return false;

        String temp = t;

        for (int i = 0; i < sLength; i++) {
            char ch = s.charAt(i);
            int index = temp.indexOf(ch);
            if (index != -1) {
                // Remove the matched character
                temp = temp.substring(0, index) + temp.substring(index + 1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}