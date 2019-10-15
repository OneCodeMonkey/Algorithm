/**
 * AC:
 * Runtime: 216 ms, faster than 46.27% of C++ online submissions for Substring with Concatenation of All Words.
 * Memory Usage: 21.4 MB, less than 69.57% of C++ online submissions for Substring with Concatenation of All Words.
 *
 * 思路：字符串匹配。
 */
class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
    	if(s.empty() || words.empty())	// 踩坑，注意处理极端情形。
    		return vector<int>();
        unordered_map<string, int> counts;
        for(string word:words)
        	counts[word]++;
        int n = s.length();
        int num = words.size();
        int len = words[0].length();

        vector<int>indexes;
        for(int i = 0; i < n - num*len + 1; i++) {
        	unordered_map<string, int> seen;
        	int j = 0;
        	for(; j < num; j++) {
        		string word = s.substr(i + j * len, len);
        		if(counts.find(word) != counts.end()) {
        			seen[word]++;
        			if(seen[word] > counts[word])
        				break;
        		} else
        			break;
        	}
        	if(j == num)
        		indexes.push_back(i);
        }

        return indexes;
    }
};