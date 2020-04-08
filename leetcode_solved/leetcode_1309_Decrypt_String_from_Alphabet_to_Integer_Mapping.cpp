/**
 * 思路：从最末尾开始，有 ‘#’ 就取前两位的数字，没‘#’ 就取前一位的数字。按 map 转换成字符串
 * AC: Runtime: 4 ms, faster than 39.48% of C++ online submissions for Decrypt String from Alphabet to Integer Mapping.
 * Memory Usage: 7.4 MB, less than 100.00% of C++ online submissions for Decrypt String from Alphabet to Integer Mapping.
 *
 * T:O(n) S:O(1)
 */
class Solution {
public:
    string freqAlphabets(string s) {
    	int len = s.length(), pos = len - 1;
    	string ans;
    	unordered_map<string, string> int_to_str = {
    		{"1", "a"}, {"2", "b"}, {"3", "c"},{"4", "d"},{"5", "e"},{"6", "f"},
    		{"7", "g"},{"8", "h"},{"9","i"},{"10","j"},{"11", "k"},{"12", "l"},
    		{"13", "m"},{"14","n"},{"15", "o"},{"16", "p"},{"17", "q"},{"18", "r"},
    		{"19", "s"},{"20", "t"},{"21", "u"},{"22", "v"},{"23", "w"}, {"24", "x"},
    		{"25", "y"},{"26", "z"}
    	};
    	while (pos >= 0) {
    		if (s[pos] == '#') {
    			pos -= 2;
    			ans = int_to_str[s.substr(pos, 2)] + ans;
    		} else {
    			ans = int_to_str[s.substr(pos, 1)] + ans;
    		}
    		pos--;
    	}

    	return ans;
    }
};