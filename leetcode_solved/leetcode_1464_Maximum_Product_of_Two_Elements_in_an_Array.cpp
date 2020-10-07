/**
 * AC:
 * Runtime: 8 ms, faster than 93.38% of C++ online submissions for Maximum Product of Two Elements in an Array.
 * Memory Usage: 10.1 MB, less than 46.23% of C++ online submissions for Maximum Product of Two Elements in an Array.
 *
 */
class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int size = nums.size();
        
        if (size == 2) {
        	return (nums[0] - 1) * (nums[1] - 1);
        }

        // 找出最大的两个即可。
        int max = 0, second = 0;
        if (nums[0] > nums[1]) {
        	max = nums[0];
        	second = nums[1];
        } else {
        	max = nums[1];
        	second = nums[0];
        }

        for (int i = 2; i <= size - 1; i++) {
        	if (nums[i] >= max) {
        		second = max;
        		max = nums[i];
        	} else if (nums[i] > second) {
        		second = nums[i];
        	}
        }

        return (max - 1) * (second - 1);
    }
};
