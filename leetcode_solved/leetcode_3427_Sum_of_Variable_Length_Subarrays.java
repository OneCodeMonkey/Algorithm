// Runtime 1 ms Beats 100.00%
// Memory 44.26 MB Beats 100.00%
// prefix sum.
// T:O(n), S:O(n)
// 
class Solution {
    public int subarraySum(int[] nums) {
        int len = nums.length, ret = 0;
        int[] dp = new int[len + 1];
        for (int i = 0; i < len; i++) {
            dp[i + 1] = dp[i] + nums[i];
        }
        for (int i = 0; i < len; i++) {
            int start = Math.max(0, i - nums[i]);
            ret += dp[i + 1] - dp[start];
        }

        return ret;
    }
}
