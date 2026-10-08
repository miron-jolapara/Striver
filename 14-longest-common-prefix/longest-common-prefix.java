class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String prefix = strs[0];

        for(int i = 1; i < len; i++) {
            int j = 0;

            while(j < prefix.length() && j < strs[i].length()) {
                if(prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                j++;
            }

            prefix = prefix.substring(0, j);

            if(prefix.length() == 0) {
                return "";
            }
        }

        return prefix;
    }
}