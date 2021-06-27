// AC: Runtime: 1 ms, faster than 93.50% of Java online submissions for Set Matrix Zeroes.
// Memory Usage: 40.7 MB, less than 34.76% of Java online submissions for Set Matrix Zeroes.
// thoughts: using the first row and first column to restore whether the whole row or column should be set to Zero
// T:O(m * n), S:O(1)
// 
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        boolean rowZeroHasZero = false, colZeroHashZero = false;
        for (int i = 0; i < row; i++) {
            boolean rowSettedZero = false;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0 && !rowZeroHasZero) {
                        rowZeroHasZero = true;
                    }
                    if (j == 0 && !colZeroHashZero) {
                        colZeroHashZero = true;
                    }
                    matrix[0][j] = 0;
                    if (!rowSettedZero) {
                        matrix[i][0] = 0;
                        rowSettedZero = true;
                    }
                }
            }
        }
        for (int i = 1; i < row; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < col; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < row; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (rowZeroHasZero) {
            for (int j = 0; j < col; j++) {
                matrix[0][j] = 0;
            }
        }
        if (colZeroHashZero) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}