// Runtime 8 ms Beats 38.48% 
// Memory 203.54 MB Beats 55.90%
// Greedy & DP
// T:O(n), S:O(n)
// 
class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
        long[] dp = new long[n];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for (int[] restriction : restrictions) {
            dp[restriction[0]] = restriction[1];
        }
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i], dp[i - 1] + diff[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            dp[i] = Math.min(dp[i], dp[i + 1] + diff[i]);
        }
        long ret = 0;
        for (long i : dp) {
            ret = Math.max(ret, i);
        }
        return (int) ret;
    }
}
