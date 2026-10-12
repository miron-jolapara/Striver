class Solution {
    public String removeOuterParentheses(String s) {
        char[] result = new char[s.length()];
        int count = 0;
        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') {
                if(count > 0) {
                    result[j++] = c;
                }
                count++;
            } else {
                count--;
                if(count > 0) {
                    result[j++] = c;
                }
            }
        }

        return new String(result, 0, j);
    }
}