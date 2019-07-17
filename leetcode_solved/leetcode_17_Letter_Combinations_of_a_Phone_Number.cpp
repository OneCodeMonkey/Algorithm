class Solution {
public:
    vector<string> letterCombinations(string digits) {
        int len = digits.length();
        int sum = 1, a, b;

        // record how many alpha choices each number have.
        int choiceCount[8] = {3, 3, 3, 3, 3, 4, 3, 4};

        int alpha[8][4] = {
        	{'a', 'b', 'c'},
        	{'d', 'e', 'f'},
        	{'g', 'h', 'i'},
        	{'j', 'k', 'l'},
        	{'m', 'n', 'o'},
        	{'p', 'q', 'r', 's'},
        	{'t', 'u', 'v'},
        	{'w', 'x', 'y', 'z'},
        };

        vector<string> ret;
        vector<int>digit;	// 记录每一位，的可选字母有几个，比如 2 有 a,b,c 三个可选字母，那么对应是3
        for(int i = 0; i < len; i++) {
        	digit.push_back(choiceCount[digits[i] + 1]);
        	sum *= choiceCount[digits[i] + 1];
        }

        for(int i = 1; i <= sum; i++) {
        	string tmpStr = "";
        	// 生成字符串。
        	int pos = 0;
        	a = i % digit[pos];
        	b = i / digit[pos];
        	tmpStr += alpha[digits[pos] - 1][a];
        	while(b > 1) {
        		pos++;
        		a = b % digit[pos];
        		b = b / digit[pos];
        		tmpStr += alpha[digits[pos] - 1][a];
        	}

        	ret.push_back(tmpStr);
        }

        return ret;
    }
};
