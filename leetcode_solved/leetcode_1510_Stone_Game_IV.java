// AC: Runtime: 12 ms, faster than 87.99% of Java online submissions for Stone Game IV.
// Memory Usage: 36.1 MB, less than 91.06% of Java online submissions for Stone Game IV.
// dp. for n, if any k cause dp[n - k*k] = false, then dp[n] = true.
// T:O(n^1.5), S:O(n)
// 
class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        dp[1] = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (!dp[i - j * j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}