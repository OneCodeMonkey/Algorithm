class Solution {
public:
    int numDistinct(string s, string t) {
     	const size_t S = s.size();
     	const size_t T = t.size();
     	if(!S || !T)
     		return 0;
     	vector<uint32_t> dp(T + 1, 0); 
     	dp[0] = 1;
     	for(size_t i = 0; i < S; i++)
     		for(size_t j = T; j >0; j--)
     			if(t[j - 1] == s[i])
     				dp[j] += dp[j - 1];

     	return dp[T];
    }
};
