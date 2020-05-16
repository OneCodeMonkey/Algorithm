/**
 * AC
 *
 */
class Solution {
public:
    int maxPower(string s) {
		int ret = 1;
		int nowLength = 1;
		int size = s.length();
		char nowChar = s[0];

		for (int i = 1; i < size; i++) {
			if (s[i] == nowChar) {
				nowLength++;
				if (nowLength > ret) {
					ret = nowLength;
				}
			}
			else {
				nowLength = 1;
				nowChar = s[i];
			}
		}

		return ret;

	}
};