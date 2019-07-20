class Solution {
public:
    int numDecodings(string s) {
        int size = s.length();
        int retCount = 0;		// 记录满足条件的结果数

        if(size < 1)
        	return 0;
        
        vector<string> map;		// 这里没有用 vector<char>，因为 C++ 类型转换很麻烦，我们后面要用 '+' 做字符串拼接，避免麻烦。
        for(int i = 0; i < 26; i++) {
        	char tempChar = 'A' + i;
        	char temp[1] = {tempChar};
        	string tempStr = temp;
        	map.push_back(tempStr);
        }

        vector<vector> ret;		// 记录生成结果。
        vector<int> initialSet;
        initialSet.push_back(s[0]);
        ret.push_back(initialSet);
        retCount++;

        for(int i = 1; i < size; i++) {		// 逐位判断。
        	int tempNum = atoi(s[i].c_str());	// 转int
        	for(int j = 0; j < ret.size(); j++) {
        		int last = ret[j][ret[j].size() - 1];	// 倒数第一个元素
        		if(last > 10) {		// 最后一个为二位数，
        			ret[j].push_back(tempNum);
        		} else {			// 最后一个为单数，则可能有两种情况，
        			if((last * 10 + tempNum) <= 26) {	// 可单个加入，也可和最后一个合并
        				// 和最后一个拼接成一个小于 26 的二位数，作为新的 vector 加入 ret
        				vector<int> newTempSet(ret[j]);
        				newTempSet[ret[j].size() - 1] = last * 10 + tempNum;

        				ret[j].push_back(tempNum);	// 加单个

        				retCount++;
        			} else {		// 只能单个加入
        				ret[j].push_back(tempNum);
        			}
        		}
        	}
        }

        return retCount;
    }

private:
	string convert(vector<int> nums, vector<string> map) {
		string s = "";
		for( auto it:nums) {
			s += map[it];
		}

		return s;
	}
};
