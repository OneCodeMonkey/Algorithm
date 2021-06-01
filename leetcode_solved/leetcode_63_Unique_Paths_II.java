// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths II.
// Memory Usage: 37.8 MB, less than 70.24% of Java online submissions for Unique Paths II.
// DP.
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int row = obstacleGrid.length, col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = 1;
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 1) {
                for (int j = i; j < row; j++) {
                    dp[i][0] = 0;
                }
                break;
            }
            dp[i][0] = 1;
        }
        for (int i = 0; i < col; i++) {
            if (obstacleGrid[0][i] == 1) {
                for (int j = i; j < col; j++) {
                    dp[0][j] = 0;
                }
                break;
            }
            dp[0][i] = 1;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[row - 1][col - 1];
    }
}