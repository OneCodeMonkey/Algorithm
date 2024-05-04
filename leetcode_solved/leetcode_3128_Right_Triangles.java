// Runtime 32 ms Beats 66.67% of users with Java
// Memory 145.21 MB Beats 66.67% of users with Java
// Prefix sum.
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        long ret = 0;
        int[][] rowSum = new int[row][col], colSum = new int[row][col], rowSumRev = new int[row][col],
                colSumRev = new int[row][col];
        for (int i = 0; i < row; i++) {
            int curSum = 0;
            for (int j = 0; j < col; j++) {
                curSum += grid[i][j];
                rowSum[i][j] = curSum;
            }
            curSum = 0;
            for (int j = col - 1; j >= 0; j--) {
                curSum += grid[i][j];
                rowSumRev[i][j] = curSum;
            }
        }
        for (int i = 0; i < col; i++) {
            int curSum = 0;
            for (int j = 0; j < row; j++) {
                curSum += grid[j][i];
                colSum[j][i] = curSum;
            }
            curSum = 0;
            for (int j = row - 1; j >= 0; j--) {
                curSum += grid[j][i];
                colSumRev[j][i] = curSum;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    int rowSumVal = rowSum[i][j], rowSumRevVal = rowSumRev[i][j], colSumVal = colSum[i][j],
                            colSumRevVal = colSumRev[i][j];
                    ret += (long) (rowSumVal - 1 + rowSumRevVal - 1) * (colSumVal - 1 + colSumRevVal - 1);
                }
            }
        }

        return ret;
    }
}
