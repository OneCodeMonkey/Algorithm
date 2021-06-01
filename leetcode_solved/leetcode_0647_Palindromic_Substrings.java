// AC: Runtime: 11 ms, faster than 35.44% of Java online submissions for Palindromic Substrings.
// Memory Usage: 43.4 MB, less than 5.32% of Java online submissions for Palindromic Substrings.
// DP, memorize the substring's results
// T:O(n^2), S:O(n^2)
// .
class Solution {
    public int countSubstrings(String s) {
        int ret = 0, size = s.length();
        if (size == 1) {
            return 1;
        }
        int[][] dp = new int[size][size];
        for (int i = size - 1; i >= 0; i--) {
            for (int j = i; j < size; j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = 0;
                } else {
                    if (j == i || j - i == 1) {
                        dp[i][j] = 1;
                        ret++;
                    } else {
                        if (dp[i + 1][j - 1] == 1) {
                            dp[i][j] = 1;
                            ret++;
                        } else {
                            dp[i][j] = 0;
                        }
                    }
                }
            }
        }

        return ret;
    }
}