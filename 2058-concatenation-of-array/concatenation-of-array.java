class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length * 2;
        int[] ans = new int[size];
        int i = 0;
        int j = 0;
        while (i < size){
            if (j == nums.length){
                j = 0;
            }
            ans[i] = nums[j];
            i++;
            j++;
        }
        return ans;
    }
}