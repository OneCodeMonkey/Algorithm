/**
 * AC:
 * Runtime: 8 ms, faster than 71.64% of C++ online submissions for Maximum Subarray.
 * Memory Usage: 9.4 MB, less than 47.06% of C++ online submissions for Maximum Subarray.
 *
 */
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int* dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < n; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = std::max(max, dp[i]);
        }
        return max;
    }
};
