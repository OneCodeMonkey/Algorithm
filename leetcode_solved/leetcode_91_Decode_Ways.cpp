class Solution {
public:
    int numDecodings(string s) {
        int size = s.length();
        int retCount = 0;		// 记录满足条件的结果数
        
        vector<string> map;		// 这里没有用 vector<char>，因为 C++ 类型转换很麻烦，我们后面要用 '+' 做字符串拼接，避免麻烦。
        for(int i = 0; i < 26; i++) {
        	char temp[1] = {'A' + i};
        	string tempStr = temp;
        	map.push_back(tempStr);
        }

        vector<vector> ret;		// 记录生成结果。


        for(int i = 0; i < size; i++) {		// 逐位判断。
        	if
        }


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
