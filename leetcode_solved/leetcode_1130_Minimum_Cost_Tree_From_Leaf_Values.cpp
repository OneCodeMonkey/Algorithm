class Solution {
public:
	/**
	 * Runtime: 4 ms, faster than 100.00% of C++ online submissions for Minimum Cost Tree From Leaf Values.
	 * Memory Usage: 9.2 MB, less than 100.00% of C++ online submissions for Minimum Cost Tree From Leaf Values.
	 *
	 */
    int mctFromLeafValues(vector<int>& arr) {
    	int n = arr.size();
    	vector<vector<pair<int,int> > > dp(n, vector<pair<int,int> > (n));
    	for(int len = 0; len < n; len++) {
    		for(int i = 0; i < n - len; i++) {
    			int j = i + len;
    			if(i == j) {
    				dp[i][j].first = 0;
    				dp[i][j].second = arr[i];
    				continue;
    			}
    			dp[i][j].first = INT_MAX;
    			dp[i][j].second = 0;
    			for(int k = i; k < j; k++) {
    				dp[i][j].second = max(dp[i][k].second, dp[k + 1][j].second);
    				int sum = dp[i][k].second * dp[k + 1][j].second;
    				sum += dp[i][k].first + dp[k + 1][j].first;
    				if(dp[i][j].first > sum)
    					dp[i][j].first = sum;
    			}
    		}
    	}
    	return dp[0][n - 1].first;	
    }
};
