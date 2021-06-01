// AC: Runtime: 1 ms, faster than 37.36% of Java online submissions for Integer Break.
// Memory Usage: 35.2 MB, less than 97.93% of Java online submissions for Integer Break.
// DP
// T:O(n^2), S:O(n)
//
class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;  // dp i =1 无实际含义，配合结构一致
        dp[2] = 1;
        if (n <= 2 && n > 0) {
            return dp[n];
        }
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            for (int j = i - 1; j >= 1; j--) {
                dp[i] = Math.max(dp[i], j * dp[i - j]);
                dp[i] = Math.max(dp[i], j * (i - j));
            }
        }
        return dp[n];
    }
}