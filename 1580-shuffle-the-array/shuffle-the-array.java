class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0, j = 0, k = 0, size = 2 * n;
        int[] num = new int[size];
        for(;i < size; i++){
            if(i % 2 == 0){
                num[i] = nums[j];
                j++;
            }
            else{
                num[i] = nums[n+k];
                k++;
            }
        }
        return num;
    }
}