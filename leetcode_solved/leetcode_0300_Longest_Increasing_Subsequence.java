// AC: Runtime: 56 ms, faster than 60.05% of Java online submissions for Longest Increasing Subsequence.
// Memory Usage: 38.7 MB, less than 66.78% of Java online submissions for Longest Increasing Subsequence.
// DP. for every j (0 <= j < i), compare dp[i] & dp[j] + 1, the max is longest subsequence in nums[0:i]
// T:O(n^2), S:O(n)
//
class Solution {
    public int lengthOfLIS(int[] nums) {
        int size = nums.length, ret = 0;
        int[] dp = new int[size];

        for (int i = 0; i < size; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ret = Math.max(ret, dp[i]);
        }

        return ret;
    }
}