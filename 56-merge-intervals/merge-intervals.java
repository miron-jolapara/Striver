import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] result = new int[intervals.length][2];
        int size = 0;

        for (int[] interval : intervals) {
            if (size == 0 || result[size - 1][1] < interval[0]) {
                result[size++] = interval;
            } else {
                result[size - 1][1] =
                    Math.max(result[size - 1][1], interval[1]);
            }
        }

        return Arrays.copyOf(result, size);
    }
}