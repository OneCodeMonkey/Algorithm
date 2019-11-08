/**
 * AC:
 * Runtime: 4 ms, faster than 61.39% of C++ online submissions for Binary Watch.
Memory Usage: 8.8 MB, less than 85.71% of C++ online submissions for Binary Watch.
 * 思路：反向思考，先把时分位上，分别 0-11，0-59的对应的二进制1的数目存起来，然后在对输入的int
 * 的二拆分遍历一下，所有的组合情况字符串就有了
 */
class Solution {
public:
	int countDigit(int n) {		// 获取二进制下1的个数,注意负数会当成负数的码来取1，比如 -1 在win32平台下编译得到的是32
		int count = 0;
		unsigned int flag = 1;	// 2进制位判断
		while (flag) {
			if (n & flag)
				count++;
			flag <<= 1;
		}
		return count;
	}
	vector<string> readBinaryWatch(int num) {
		vector<string> ret;
		vector<vector<string>> hour(12, vector<string>());
		vector<vector<string>> minute(60, vector<string>());
		int digit = 0;
		for (int i = 0; i < 12; i++) {
			digit = countDigit(i);
			string temp = to_string(i);
			hour[digit].push_back(temp);
		}
		for (int i = 0; i < 60; i++) {
			digit = countDigit(i);
			string temp = "";
			if (i < 10) {
				temp = "0" + to_string(i);
			}
			else {
				temp = to_string(i);
			}
			minute[digit].push_back(temp);
		}

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < hour[i].size(); j++)
				for (int k = 0; k < minute[num - i].size(); k++) {
					string alternative = hour[i][j] + ":" + minute[num - i][k];
					ret.push_back(alternative);
				}
		}

		return ret;
	}
};