/**
 * Runtime: 12 ms, faster than 60.71% of C++ online submissions for Search Insert Position.
 * Memory Usage: 9.7 MB, less than 73.95% of C++ online submissions for Search Insert Position.
 *
 */
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
        	if (nums[i] >= target) {
        		return i;
        	} else if (i + 1 < nums.size() && nums[i + 1] >= target) {
        		return i + 1;
        	}
        }

        return nums.size();
    }
};