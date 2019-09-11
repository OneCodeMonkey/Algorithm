/**
 * 思路失败, O(n^2) 不能接收，且内存也是 O(n^2),
 * 下面是论坛的解法，非原创
 *
 * 思路：生成一张 dp[n+1][n+1] 的表，dp[i][j] 代表子数组 [i,j] 连乘积
 * 如果不满足 dp[i][j] < k 的题设条件，那么 dp[i][j] = -1
 *
 */
class Solution {
public:
 //    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
	// 	int size = nums.size();
	// 	int ans = 0;
	// 	vector<vector<int>> dp(size, vector<int>(size, 0));
	// 	for (int i = 0; i < size; i++) {
	// 		if (nums[i] >= k)
	// 			dp[i][i] = -1;
	// 		else {
	// 			dp[i][i] = nums[i];
	// 			ans++;
	// 		}
	// 	}
	// 	for (int i = 0; i < size; i++) {
	// 		for (int j = i + 1; j < size; j++) {
	// 			if (dp[i][j - 1] == -1)
	// 				dp[i][j] = -1;
	// 			else if (dp[i][j - 1] * nums[j] >= k)
	// 				dp[i][j] = -1;
	// 			else {
	// 				dp[i][j] = dp[i][j - 1] * nums[j];
	// 				ans++;
	// 			}
	// 		}
	// 	}

	// 	return ans;
	// }
	int numSubarrayProductLessThanK(vector<int>& nums, int k) {
		if(k <= 1)
			return 0;
		int n = nums.size(), prod = 1, ans = 0, left = 0;
		for(int i = 0; i < n; i++) {
			prod *= nums[i];
			while(prod >= k)
				prod /= nums[left++];
			ans += i - left + 1;
		}
		return ans;
	}
};
