// Runtime 4 ms Beats 44.49% of users with C++
// Memory 7.12 MB Beats 24.18% of users with C++
// .
// T:O(n), S:O(1)
// 
class Solution {
public:
    bool halvesAreAlike(string s) {
		int len1 = 0, len2 = 0;
		int length = s.size();
		for (int i = 0; i < length; i++) {
			if (checkVowel(s[i])) {
				if (i < length / 2) {
					len1++;
				}
				else {
					len2++;
				}
			}
		}

		if (len1 == len2) {
			return true;
		}

		return false;
	}

    bool checkVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
			c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		}

		return false;
	}
};
