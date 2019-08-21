class Solution {
public:
	/**
	 * 思路：此题要求两个字符串的最长公共子序列，返回此公共子序列的长度。
	 * 容易和另外一个问题搞混淆，这里不是求最长公共子串，子串里各个字符是连续出现在原字符串，子序列不需要连续
	 * 采用查表法。具体分析过程看下面帖子
	 *
	 * @see 
	 */
    int longestCommonSubsequence(string &a, string &b) {
      vector<vector<short>> m(a.size() + 1, vector<short>(b.size() + 1));
      for (auto i = 1; i <= a.size(); ++i)
        for (auto j = 1; j <= b.size(); ++j)
          if (a[i - 1] == b[j - 1]) m[i][j] = m[i - 1][j - 1] + 1;
          else m[i][j] = max(m[i - 1][j], m[i][j - 1]);
      return m[a.size()][b.size()];
    }
};
