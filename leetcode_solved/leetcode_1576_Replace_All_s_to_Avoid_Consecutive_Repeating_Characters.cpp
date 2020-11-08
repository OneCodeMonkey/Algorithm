class Solution {
public:
    string modifyString(string s) {
        int size = strlen(s);
        string ret = "";

        for (int i = 0; i < size; i++) {
        	if (s[i] == '?') {

        	} else {
        		ret.append(s[i]);
        	}
        }

        return ret;
    }
};
