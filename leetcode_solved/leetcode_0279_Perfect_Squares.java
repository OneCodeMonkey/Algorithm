// AC: Runtime: 32 ms, faster than 69.60% of Java online submissions for Perfect Squares.
// Memory Usage: 38 MB, less than 74.32% of Java online submissions for Perfect Squares.
// DP. for every j (j^2 < i), choose minimum (dp[i - j^2] + 1) and i itself.
// T:O(n * sqrt(n)), S:O(n)
// 
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}