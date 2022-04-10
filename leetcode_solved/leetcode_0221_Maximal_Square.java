// AC: Runtime: 9 ms, faster than 44.93% of Java online submissions for Maximal Square.
// Memory Usage: 58 MB, less than 60.41% of Java online submissions for Maximal Square.
// dp. (i, j) maximum is (i, j) == 1 ? 1 + min((i - 1, j), (i, j - 1), (i - 1, j - 1)): 0
// T:(m * n), S:O(m * n)
// 
class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length, col = matrix[0].length, ret = 0;
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                dp[i][j] = matrix[i - 1][j - 1] == '1' ?
                        1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) :
                        0;
                ret = Math.max(ret, dp[i][j]);
            }
        }

        return ret * ret;
    }
}
