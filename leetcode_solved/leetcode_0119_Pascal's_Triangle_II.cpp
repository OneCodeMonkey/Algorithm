/**
 * AC:
 * Runtime: 4 ms, faster than 59.24% of C++ online submissions for Pascal's Triangle II.
 * Memory Usage: 8.6 MB, less than 51.61% of C++ online submissions for Pascal's Triangle II.
 * 思路：不做任何优化的话，可以直接套用第 118 题的结果。
 *
 */
class Solution {
public:
    vector<int> getRow(int rowIndex) {
        rowIndex = rowIndex + 1;
        vector<vector<int>>ret;
        vector<int> temp;
        if(rowIndex == 0)
        	return temp;

        int tempNum = 0;
        temp.push_back(1);
        ret.push_back(temp);

        for(int i = 2; i <= rowIndex; i++) {
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

        return ret[rowIndex - 1];
    }
};