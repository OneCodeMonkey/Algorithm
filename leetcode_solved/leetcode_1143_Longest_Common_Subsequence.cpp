class Solution {
public:
	/**
	 * 思路：此题要求两个字符串的最长公共子序列，返回此公共子序列的长度。
	 * 容易和另外一个问题搞混淆，这里不是求最长公共子串，子串里各个字符是连续出现在原字符串，子序列不需要连续
	 * 采用查表法。具体分析过程看下面帖子
	 *
	 * @see 
	 */
    int longestCommonSubsequence(string text1, string text2) {
		int size1 = text1.length();
		int size2 = text2.length();
		vector<vector<int> > record(size1, vector<int>(size2, 0));
		int maxLen = 0;

		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				if (i == 0 || j == 0) {
					if (text2[j] == text1[i])
						record[i][j] = 1;
				}
				else {
					if (text2[j] == text1[i])
						record[i][j] = record[i - 1][j - 1] + 1;
					else
						record[i][j] = record[i - 1][j - 1];
				}
				if (record[i][j] > maxLen) {
					maxLen = record[i][j];
				}
			}
		}

		return maxLen;
	}
};
