/**
 * AC：
 * Runtime: 4 ms, faster than 97.08% of C++ online submissions for Cells with Odd Values in a Matrix.
 * Memory Usage: 7.9 MB, less than 78.78% of C++ online submissions for Cells with Odd Values in a Matrix.
 *
 */
class Solution {
public:
    int oddCells(int n, int m, vector<vector<int>>& indices) {
		int rowSize = indices.size();
		vector<int> row(n, 0);
		vector<int> col(m, 0);
		int ret = 0;

		for (int i = 0; i < rowSize; i++) {
			row[indices[i][0]]++;
			col[indices[i][1]]++;
		}

		// 计算奇数个数
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((row[i] + col[j]) % 2 == 1) {
					ret++;
				}
			}
		}

		return ret;
	}
};