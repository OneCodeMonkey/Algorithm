class Solution {
public:
    int distinctEchoSubstrings(string text) {
		vector<string> ret;
		int textLength = text.length();
		for (int i = 0; i < textLength; i++) {
			for (int j = i + 1; j < textLength; j += 2) {	// 偶数个字符的子串
				bool flag = true;
				for (int k = 0; k < (j - i + 1) / 2; k++) {
					if (text[i + k] != text[(j + i) / 2 + 1 + k]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					string temp = text.substr(i, (j - i) + 1);
					ret.push_back(temp);
				}
			}
		}
		set<string>s(ret.begin(), ret.end());	// 去重

		return s.size();
	}
};