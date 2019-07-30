/**
 *
解析：



 *
 */
class Solution {
public:
    int maximalRectangle(vector<vector<char>>& matrix) {
     	if(matrix.empty() || matrix[0].empty())
     		return 0;
     	int rows = matrix.size();
     	int cols = matrix[0].size();
     	int ret = 0;
     	vector<int>h(cols + 1);
     	for(int i = 0; i < rows; i++) {
     		stack<int>lowi;
     		for(int j = 0; j <= cols; j++) {
     			h[j] = ((j != cols && matrix[i][j] == '1') ? h[j] + 1 : 0);
     			while(!lowi.empty() && (h[j] < h[lowi.top()])) {
     				int height = h[lowi.top()];
     				lowi.pop();
     				int lefti = (lowi.empty() ? -1 : lowi.top());
     				ret = max((j - lefti - 1) * height, ret);
     			}
     			lowi.push(j);
     		}
     	}
     	return ret;
    }
};
