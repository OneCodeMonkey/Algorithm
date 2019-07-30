class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string prefix = "";
        int n = strs.size();
        
        for(int t = 0; n > 0; prefix += strs[0][t], t++) {
        	for(int i = 0; i < n; i++) {
        		if(t >= strs[i].size() || (i > 0 && strs[i][t] != strs[i - 1][t]))
        			return prefix;
        	}
        }

        return prefix;
    }
};
