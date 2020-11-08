class Solution {
public:
	int countNegatives(vector<vector<int>>& grid) {
		int count = 0;
		for (int i = 0; i < grid.size(); i++) {
			// 二分查找,找到从左边起第一个负数
			int left = 0, right = grid[0].size() - 1;
			int mid = (left + right) / 2;

			while (left < right) {
				if (grid[i][mid] >= 0) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}

		return count;
	}
};
