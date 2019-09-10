class Solution {
public:
    string shortestPalindrome(string s) {
        int size = s.size();
        if(size == 0) {
        	string s = "";
        	return s;
        }

        int maxPos = 0;
        for(int i = 0; i < size; i++) {
        	bool flag = true;
        	for(int j = 0; j < i / 2; j++) {
        		if(s[j] != s[i - j]) {
        			flag = false;
        			break;
        		}
        	}
        	if(flag)
        		maxPos = i;
        }

        string ret = "";
        for(int i = size - 1; i > maxPos; i++)
        	ret += s[i];

        ret += s;

        return ret;
    }
};
