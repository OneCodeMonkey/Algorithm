// Runtime 23 ms Beats 70.19%
// Memory 45.53 MB Beats 23.31%
// DP. To make dp[i] string balanced, either to delete 'a' or 'b'.
// T:O(n), S:O(n)
// 
class Solution {
    public int minimumDeletions(String s) {
        int ret = 0, len = s.length(), countB = 0;
        int[] dp = new int[len + 1];
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'b') {
                dp[i + 1] = dp[i];
                countB++;
            } else {
                dp[i + 1] = Math.min(dp[i] + 1, countB);
            }
        }

        return dp[len];
    }
}
