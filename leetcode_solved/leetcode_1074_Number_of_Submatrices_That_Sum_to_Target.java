// AC: Runtime 194 ms Beats 14.37% 
// Memory 43.8 MB Beats 20.69%
// Prefix sum
// T:O(m ^ 2 * n ^ 2), S:O(m * n)
// 
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length, ret = 0;
        int[][] sumRow = new int[row][col], sumMatrix = new int[row + 1][col + 1];
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
                sumRow[i][j] = sum;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumMatrix[i + 1][j + 1] = sumMatrix[i][j + 1] + sumRow[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int i2 = i; i2 < row; i2++) {
                    for (int j2 = j; j2 < col; j2++) {
                        int tempSumMatrix = sumMatrix[i2 + 1][j2 + 1] - sumMatrix[i][j2 + 1] - sumMatrix[i2 + 1][j] +
                                sumMatrix[i][j];
                        if (tempSumMatrix == target) {
                            ret++;
                        }
                    }
                }
            }
        }

        return ret;
    }
}
