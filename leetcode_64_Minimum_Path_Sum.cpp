class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        vector<vector<int> >dp(m+1, vector<int>(n+1, 0));
        dp[1][1] = grid[0][0];  // 初始值
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                // dp[i][j] = grid[i-1][j-1] + min(dp[i-1][j], dp[i][j-1]);    // 未考虑边界情况。边界不能取不存在的值 0 作为 min
                if(i == 1)
                    dp[i][j] = grid[i - 1][ j - 1] + dp[i][j - 1];
                else if(j == 1)
                    dp[i][j] = grid[i - 1][ j - 1] + dp[i - 1][j];
                else
                    dp[i][j] = grid[i - 1][ j - 1] + min(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return dp[m][n];
    }
};
