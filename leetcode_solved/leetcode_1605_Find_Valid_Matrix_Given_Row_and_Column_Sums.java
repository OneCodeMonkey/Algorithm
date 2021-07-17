// AC: Runtime: Runtime: 9 ms, faster than 24.66% of Java online submissions for Find Valid Matrix Given Row and Column Sums.
// Memory Usage: 47.8 MB, less than 21.75% of Java online submissions for Find Valid Matrix Given Row and Column Sums.
// Greedy.
// T:O(m * n), S:O(n)
// 
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int row = rowSum.length, col = colSum.length;
        int[][] ret = new int[row][col];
        // record assigned element's column sum.
        int[] tempColSum = new int[col];

        for (int i = 0; i < row; i++) {
            int tempRowSum = 0;
            for (int j = 0; j < col; j++) {
                if (i - 1 >= 0) {
                    tempColSum[j] += ret[i - 1][j];
                }
                ret[i][j] = Math.min(rowSum[i] - tempRowSum, colSum[j] - tempColSum[j]);
                tempRowSum += ret[i][j];
            }
        }

        return ret;
    }
}