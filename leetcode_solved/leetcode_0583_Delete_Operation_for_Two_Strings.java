// AC: Runtime: 6 ms, faster than 97.93% of Java online submissions for Delete Operation for Two Strings.
// Memory Usage: 43 MB, less than 64.69% of Java online submissions for Delete Operation for Two Strings.
// dynamic programming
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                dp[i + 1][j + 1] = word1.charAt(i) == word2.charAt(j) ? dp[i][j] + 1 : Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }

        return len1 + len2 - 2 * dp[len1][len2];
    }
}