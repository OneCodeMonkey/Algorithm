// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Binary Search Trees.
// Memory Usage: 37.5 MB, less than 18.78% of Java online submissions for Unique Binary Search Trees.
// DP.
// T:O(n ^ 2), S:O(n)
// 
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }
}