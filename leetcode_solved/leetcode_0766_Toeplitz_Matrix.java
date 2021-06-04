// AC: Runtime: 1 ms, faster than 68.95% of Java online submissions for Toeplitz Matrix.
// Memory Usage: 38.8 MB, less than 86.71% of Java online submissions for Toeplitz Matrix.
// .
// T:O(m * n), S:O(1)
//
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        if (row == 1 || col == 1) {
            return true;
        }
        for (int i = 0; i < row; i++) {
            int start = matrix[i][0];
            for (int j = 1; i + j < row && j < col; j++) {
                if (matrix[i + j][j] != start) {
                    return false;
                }
            }
        }
        for (int i = 1; i < col; i++) {
            int start = matrix[0][i];
            for (int j = 1; j < row && i + j < col; j++) {
                if (matrix[j][i + j] != start) {
                    return false;
                }
            }
        }

        return true;
    }
}