/**
 * 思路：生成一张 dp[n+1][n+1] 的表，dp[i][j] 代表子数组 [i,j] 连乘积
 * 如果不满足 dp[i][j] < k 的题设条件，那么 dp[i][j] = -1
 *
 */
class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        int size = nums.size();
        int ans = 0;
        vector<vector<int>> dp(size, vector<int>(size, 0));
        for(int i = 0; i < size; i++) {
        	for(int j = i; j < size; j++) {
        		if(j == i) {
        			if(nums[i] >= k)
        				dp[i][j] = -1;
        			else {
        				dp[i][j] = nums[j];
        				ans++;
        			}
        		} else {
        			if(dp[i][j - 1] == -1)
        				dp[i][j] = -1;
        			else if(dp[i][j - 1] * nums[j] >= k)
        				dp[i][j] = -1;
        			else {
        				dp[i][j] = dp[i][j - 1] * nums[j];
        				ans++;
        			}
        		}
        	}
        }

        return ans;
    }
};
