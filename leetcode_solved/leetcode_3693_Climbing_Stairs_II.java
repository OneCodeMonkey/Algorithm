// Runtime 5 ms Beats 96.62% 
// Memory 63.32 MB Beats 70.05%
// Dynamic prog.
// T:O(n), S:O(n)
// 
class Solution {
    public int climbStairs(int n, int[] costs) {
        int ret = 0, len = costs.length;
        int[] dp = new int[len + 1];
        dp[0] = 0;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                dp[i + 1] = costs[0] + 1;
            } else if (i == 1) {
                dp[i + 1] = Math.min(dp[i - 1] + costs[1] + 2 * 2, dp[i] + costs[1] + 1);
            } else {
                dp[i + 1] = Math.min(Math.min(dp[i - 2] + costs[i] + 3 * 3, dp[i - 1] + costs[i] + 2 * 2), dp[i] + costs[i] + 1);
            }
        }

        return dp[len];
    }
}
