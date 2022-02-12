// AC: Runtime: 16 ms, faster than 66.93% of Java online submissions for Longest Common Subsequence.
// Memory Usage: 46.6 MB, less than 12.77% of Java online submissions for Longest Common Subsequence.
// dynamic programming
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length(), len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                dp[i + 1][j + 1] = text1.charAt(i) == text2.charAt(j) ? dp[i][j] + 1 : Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }

        return dp[len1][len2];
    }
}