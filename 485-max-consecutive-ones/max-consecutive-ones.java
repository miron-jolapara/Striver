class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int count = 0;
        int max = 0;
        while(i < n){
            if(nums[i] == 1)
                count++;
            else{
                if(count > max)
                    max = count;
                count = 0;
            }
            i++;
        }
        if(count > max)
            return count;
        return max;
        
    }
}