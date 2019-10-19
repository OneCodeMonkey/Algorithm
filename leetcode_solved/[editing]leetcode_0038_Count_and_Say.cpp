/**
 * AC:
 * Runtime: 4 ms, faster than 77.24% of C++ online submissions for Count and Say.
 * Memory Usage: 8.7 MB, less than 93.06% of C++ online submissions for Count and Say.
 */
class Solution {
public:
    string countAndSay(int n) {
        if(n == 0)
        	return "";
        string ret = "1";
        while(--n) {
        	string temp = "";
        	for(int i = 0; i < ret.size(); i++) {
        		int count = 1;
        		while((ret.size() > i + 1) && (ret[i] == ret[i + 1])) {
        			count++;
        			i++;
        		}
        		temp += to_string(count) + ret[i];
        	}
        	ret = temp;
        }

        return ret;
    }
};