class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return;

        k %= n;
        if (k == 0) return;

        int moved = 0;

        for (int start = 0; moved < n; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                moved++;
            } while (current != start);
        }
    }
}