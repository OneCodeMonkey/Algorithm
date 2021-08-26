// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber II.
// Memory Usage: 36.8 MB, less than 15.90% of Java online submissions for House Robber II.
// DP: same as leetcode198-house-robber
// T:O(2 * n), S:O(n)
//
class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }
        int ret1 = solve(nums, 0, size - 2);
        int ret2 = solve(nums, 1, size - 1);

        return Math.max(ret1, ret2);
    }

    private int solve(int[] nums, int start, int end) {
        int size = end - start + 1;
        if (size == 1) {
            return nums[start];
        }
        int[] dp = new int[size];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i - start] = Math.max(dp[i - start - 2] + nums[i], dp[i - start - 1]);
        }

        return dp[size - 1];
    }
}