// AC: Runtime: 5 ms, faster than 91.72% of Java online submissions for Count Square Submatrices with All Ones.
// Memory Usage: 51.4 MB, less than 42.31% of Java online submissions for Count Square Submatrices with All Ones.
// DP: dp[i][j] means how many ones square which use matrix[i][j] as bottom-right element.
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public int countSquares(int[][] matrix) {
        int ret = 0, row = matrix.length, col = matrix[0].length;
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    dp[i + 1][j + 1] = Math.min(dp[i][j + 1], Math.min(dp[i + 1][j], dp[i][j])) + 1;
                    ret += dp[i + 1][j + 1];
                }
            }
        }

        return ret;
    }
}