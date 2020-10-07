/**
 * 思路：普通暴力解法可以过。可在字符串数组去重处用 hashmap 做优化。
 *
 * AC:
 * Runtime: 4 ms, faster than 95.54% of C++ online submissions for Unique Morse Code Words.
 * Memory Usage: 8.7 MB, less than 74.67% of C++ online submissions for Unique Morse Code Words.
 *
 */
class Solution {
public:
	int uniqueMorseRepresentations(vector<string>& words) {
		int size = words.size();
		if (size == 0) {
			return 0;
		}

		vector<string> ret;

		string map[26] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		for (int i = 0; i <= size - 1; i++) {
			string s = "";
			for (int j = 0; j <= words[i].length() - 1; j++) {
				int charNum = words[i][j];
				s.append(map[charNum - 97]);
			}

			bool isExistedInRet = false;
			int nowRetSize = ret.size();
			for (int k = 0; k <= nowRetSize - 1; k++) {
				if (ret[k] == s) {
					isExistedInRet = true;
				}
			}
			if (!isExistedInRet) {
				ret.push_back(s);
			}
		}

		return ret.size();
	}
};
