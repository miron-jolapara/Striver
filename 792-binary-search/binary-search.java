class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int i = 0;
        int j = len - 1;
        while(i <= j){
            int mid = (i + j) / 2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid])
                j = mid - 1;
            else
                i = mid + 1;
        }   
        return -1;
    }
}