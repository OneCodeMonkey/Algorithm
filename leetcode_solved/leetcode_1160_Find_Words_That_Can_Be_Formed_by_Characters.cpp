/**
 * 思路：对比字符串时，先对两个字符串做排序，然后顺序对比。如果不一致就返回false, 能匹配到末尾则代表符合
 *
 */
class Solution {
public:
	int check(string word, vector<char> chars1) {
		int sizeChars1 = chars1.size();
		vector<char> word1;
		for(auto charItem:word) {
			word1.push_back(charItem);
		}
		int sizeWord1 = word1.size();

		// 顺序逐位对比，在 chars 中有重复的就跳过重复的 char
		int posChars = 0;
		char lastChar;
		for(int i = 0; i < sizeWord1; i++) {
			if(word1[i] == chars1[posChars]) {
				posChars++;
				lastChar = word1[i];
			} else if(chars1[posChars] == lastChar) {
				while(chars1[posChars] == lastChar && posChars < sizeChars1 - 1)
					posChars++;
				if(word1[i] == chars1[posChars]) {
					posChars++;
					lastChar = word1[i];
				} else {	// 出现不匹配了
					return 0;
				}
			} else {	// 出现不匹配了
				return 0;
			}
		}

		return sizeWord1;
	}
    int countCharacters(vector<string>& words, string chars) {
        int ans = 0;
        vector<char> chars1;
        for(auto charItem:chars)
        	chars1.push_back(charItem);

        for(auto word:words) {
        	ans += check(word, chars1);
        }

        return ans;
    }
};
