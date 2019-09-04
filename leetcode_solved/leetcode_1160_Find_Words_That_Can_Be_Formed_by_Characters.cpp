/**
 * 思路：对比字符串时，先对两个字符串做排序，然后顺序对比。如果不一致就返回false, 能匹配到末尾则代表符合
 *
 */
class Solution {
public:
	int check(string word, vector<char> chars1) {
		int sizeChars1 = chars1.size();
		vector<char> word1;
		for (auto charItem : word) {
			word1.push_back(charItem);
		}

		sort(word1.begin(), word1.end());
		int sizeWord1 = word1.size();

		// 顺序逐位对比，在 chars 中有重复的就跳过重复的 char
		int posChars = 0;
		char lastChar = 'A';
		for (int i = 0; i < sizeWord1; i++) {
			if (posChars == sizeChars1)	// index 越界
				return 0;
			if (word1[i] == chars1[posChars]) {
				posChars++;
				lastChar = word1[i];
				continue;
			}
			// 如果当前不匹配是chars1 现在有重复字符，则跳过重复字符
			if (word1[i] != chars1[posChars] && chars1[posChars] == lastChar) {
				while (chars1[posChars] == lastChar && posChars < sizeChars1 - 1)
					posChars++;
				if (word1[i] == chars1[posChars]) {
					posChars++;
					lastChar = word1[i];
					continue;
				}
			}
			// 跳过重复字符仍不匹配，继续尝试往下寻找更大的字符能不能匹配，如果走到了最末尾仍不匹配，则代表不满足
			while (chars1[posChars] != word1[i] && posChars < sizeChars1){
				posChars++;
				if (posChars == sizeChars1)	// 剩余的字符都不满足
					return 0;
			}
			lastChar = word1[i];
		}

		return sizeWord1;
	}
	int countCharacters(vector<string>& words, string chars) {
		int ans = 0;
		vector<char> chars1;
		for (auto charItem : chars)
			chars1.push_back(charItem);

		sort(chars1.begin(), chars1.end());

		for (auto word : words) {
			ans += check(word, chars1);
		}

		return ans;
	}
};
