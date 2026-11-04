import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] result = new int[intervals.length][2];
        int size = 0;

        for (int[] in : intervals) {
            if (size == 0 || result[size - 1][1] < in[0]) {
                result[size++] = in;
            } else {
                result[size - 1][1] = Math.max(result[size - 1][1], in[1]);
            }
        }

        return Arrays.copyOf(result, size);
    }
}