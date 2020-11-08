/**
 * 
 */
class Solution {
public:
    int trap(vector<int>& height) {
		if (height.empty()) {
			return 0;
		}
		int size = height.size();
		int water_capacity = 0;
		// 1. 找到最大高度 max_height
		int max_height = height[0];
		for (int i = 0; i < size; i++) {
			if (height[i] > max_height)
				max_height = height[i];
		}

		// 2.开始从最大高度开始，每次按一横行来判断此高度的积水容积。
		for (int i = max_height; i >= 1; i--) {
			int left_side = -1, right_side = -1;
			int count = 0;
			for (int j = 0; j < size; j++) {
				if (height[j] >= i) {
					count++;
					if (-1 == left_side) {
						left_side = j;
					}
					if (j > right_side)
						right_side = j;
				}
			}
			// 累加此高度下的容积。
			if (left_side < right_side) {
				water_capacity += (right_side - left_side - 1) - (count - 2);
			}
		}

		return water_capacity;
	}
};