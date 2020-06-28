/**
 * Runtime: 20 ms, faster than 54.78% of C++ online submissions for Find First and Last Position of Element in Sorted Array.
 * Memory Usage: 13.9 MB, less than 25.94% of C++ online submissions for Find First and Last Position of Element in Sorted Array.
 *
 */
class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ret;
    	int left = 0, right = 0;
        int isLeftFound = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (!isLeftFound && nums[i] == target) {
                left = right = i;
                isLeftFound = 1;
                continue;
            }

            if (isLeftFound && nums[i] == target) {
                right = i;
            }
        }

        if (!isLeftFound) {
            ret.push_back(-1);
            ret.push_back(-1);
        } else {
            ret.push_back(left);
            ret.push_back(right);
        }

        return ret;
    }
};
