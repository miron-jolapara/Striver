class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        int len = s.length();

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                count++;

                if(count > max) {
                    max = count;
                }
            }
            else if(s.charAt(i) == ')') {
                count--;
            }
        }

        return max;
    }
}