/**
 * AC:
 * Runtime: 4 ms, faster than 70.73% of C++ online submissions for Length of Last Word.
 * Memory Usage: 8.7 MB, less than 91.67% of C++ online submissions for Length of Last Word.
 * 思路：注意最后一个词是最后一个不包含空格的最长子字符串。比如 "b aaba   " 这种，"aaba" 就是last_word
 *
 */
class Solution {
public:
    int lengthOfLastWord(string s) {
    	int length = 0, lastWordLength = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s[i] == ' ') {
        		length = 0;
        		continue;
        	} else {
        		length++;
        		lastWordLength = length;
        	}
        }

        return lastWordLength;
    }
};