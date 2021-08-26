// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
// Memory Usage: 38.6 MB, less than 6.29% of Java online submissions for House Robber.
// DP: if we rob house i, then max value is dp[i - 2] + nums[i], if not, max value is equal to dp[i - 2].
// T:O(n), S:O(n)
//
class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }
        int[] dp = new int[size];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < size; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[size - 1];
    }
}