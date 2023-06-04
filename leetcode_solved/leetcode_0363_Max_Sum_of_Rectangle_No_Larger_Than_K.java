// AC: Runtime 177 ms Beats 91.58% 
// Memory 44.7 MB Beats 5.26%
// Prefix Sum
// T:O(m ^ 2 * n ^ 2), S:O(m * n)
// 
class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int row = matrix.length, col = matrix[0].length, ret = Integer.MIN_VALUE;
        int[][] rowSum = new int[row + 1][col + 1], topLeftSum = new int[row + 1][col + 1];
        for (int i = 0; i < row; i++) {
            int oneRowSum = 0;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == k) {
                    return k;
                } else if (matrix[i][j] < k) {
                    ret = Math.max(ret, matrix[i][j]);
                }
                oneRowSum += matrix[i][j];
                rowSum[i + 1][j + 1] = oneRowSum;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                topLeftSum[i + 1][j + 1] = topLeftSum[i][j + 1] + rowSum[i + 1][j + 1];
            }
        }
        for (int x1 = 0; x1 < row; x1++) {
            for (int y1 = 0; y1 < col; y1++) {
                for (int x2 = x1; x2 < row; x2++) {
                    for (int y2 = y1; y2 < col; y2++) {
                        int matrixSum = topLeftSum[x2 + 1][y2 + 1] - topLeftSum[x1][y2 + 1] - topLeftSum[x2 + 1][y1] + topLeftSum[x1][y1];
                        if (matrixSum == k) {
                            return k;
                        }
                        if (matrixSum < k) {
                            ret = Math.max(ret, matrixSum);
                        }
                    }
                }
            }
        }

        return ret;
    }
}
