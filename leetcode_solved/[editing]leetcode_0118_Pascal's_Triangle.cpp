/**
 * AC：
 * Runtime: 4 ms, faster than 60.36% of C++ online submissions for Pascal's Triangle.
 * Memory Usage: 8.9 MB, less than 66.67% of C++ online submissions for Pascal's Triangle.
 *
 * 思路：按照定义的方式，模拟生成数组即可。
 *
 */
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>ret;
        if(numRows == 0)
        	return ret;

        vector<int> temp;
        int tempNum = 0;
        temp.push_back(1);
        ret.push_back(temp);

        for(int i = 2; i <= numRows; i++) {
        	temp.clear();
        	for(int j = 1; j <= i; j++) {
        		if(j == 1) {
        			tempNum = ret[i - 2][0];
        			temp.push_back(tempNum);
        			continue;
        		}
        		if(j == i) {
        			tempNum = ret[i - 2][i - 2];
        			temp.push_back(tempNum);
        			continue;
        		}
        		
        		tempNum = ret[i - 2][j - 2] + ret[i - 2][j - 1];
        		temp.push_back(tempNum);
        	}
        	ret.push_back(temp);
        }

        return ret;
    }
};