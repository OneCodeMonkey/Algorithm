class Solution {
public:
	/**
	 * 求所有子串里的最大字典序的子字符串。
	 * 
	 */
    string lastSubstring(string s) {
        char maxc = s[0];
        int max_idx = 0;
        for(int i = 1; i < s.size(); i++) {
        	if(s[i] > maxc) {
        		max_idx = i;
        		maxc = s[i];
        	} else if(s[i] == maxc) {
        		int ii = i++;
        		int prev_idx = max_idx - ii;
        		while(i < s.size() && s[i] == s[prev_idx + i]) {
        			i++;
        		}
        		if(i < s.size() && s[i] > s[prev_idx + i]) {
        			max_idx = ii;
        			i = ii;
        		}
        	}
        }
        return s.substr(max_idx);
    }
};
