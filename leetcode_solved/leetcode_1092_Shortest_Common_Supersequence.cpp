// AC: Runtime 266 ms Beats 6.36% 
// Memory 299.5 MB Beats 5.1%
// DP.
// T:O(m * n), S:O(m * n)
// 
class Solution {
public:
    string shortestCommonSupersequence(string str1, string str2) {
        int i = 0, j = 0;
        string res = "";
        for(char c:lcs(str1, str2)) {
        	while(str1[i] != c)
        		res += str1[i++];
        	while(str2[j] != c)
        		res += str2[j++];
        	res += c;
        	i++;
        	j++;
        }

        return res + str1.substr(i) + str2.substr(j);
    }

    string lcs(string& A, string& B) {
    	int n = A.size();
    	int m = B.size();
    	vector<vector<string> >dp(n + 1, vector<string>(m + 1, ""));
    	for(int i = 0; i < n; i++)
    		for(int j = 0; j < m; j++)
    			if(A[i] == B[j])
    				dp[i + 1][j + 1] = dp[i][j] + A[i];
    			else
    				dp[i + 1][j + 1] = dp[i + 1][j].size() > dp[i][j + 1].size() ? dp[i + 1][j] : dp[i][j + 1];

		return dp[n][m];    			
    }
};
