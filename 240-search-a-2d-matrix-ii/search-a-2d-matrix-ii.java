class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;

        for (int i = 0; i < rows; i++) {
            int len = matrix[i].length;
            int low = 0;
            int high = len - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}