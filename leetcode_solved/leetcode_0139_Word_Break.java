// AC: Runtime: 10 ms, faster than 25.12% of Java online submissions for Word Break.
// Memory Usage: 44.1 MB, less than 7.54% of Java online submissions for Word Break.
// DP.
// T:O(n ^ 2), S:O(n)
//
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int size = s.length();
        boolean[] dp = new boolean[size + 1];
        HashSet<String> record = new HashSet<>(wordDict);
        dp[0] = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (dp[j] && record.contains(s.substring(j, i + 1))) {
                    dp[i + 1] = true;
                    break;
                }
            }
        }

        return dp[size];
    }
}