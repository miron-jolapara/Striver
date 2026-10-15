class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int temp;

        // First pass: move all 0s to the front
        while(left < right) {
            if(nums[left] == 0) {
                left++;
            }
            else if(nums[right] != 0) {
                right--;
            }
            else {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        // Second pass: move all 1s before 2s
        left = 0;
        right = len - 1;

        while(left < right) {
            if(nums[left] == 0 || nums[left] == 1) {
                left++;
            }
            else if(nums[right] == 2) {
                right--;
            }
            else {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
}