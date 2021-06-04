// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
// Memory Usage: 35.8 MB, less than 53.02% of Java online submissions for Unique Paths.
// DP problem.
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        if (m == 1 || n == 1) {
            return dp[m - 1][n - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}