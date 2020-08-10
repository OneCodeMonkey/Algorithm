/**
 * 思路：这题是要返回去重后的结果数组长度，同时要对入参的数组进行修改，改成去重后的结果。
 *      注意是要用“原地算法”，不能再 new 一个新的数组来存。
 * AC：Runtime: 144 ms, faster than 17.01% of C++ online submissions for Remove Duplicates from Sorted Array.
 *     Memory Usage: 14 MB, less than 29.52% of C++ online submissions for Remove Duplicates from Sorted Array.
 */
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
		if (nums.size() == 0 || nums.size() == 1) {
			return nums.size();
		}

		int lastNum = nums[0];
		vector<int>::iterator it = nums.begin();
		for (++it; it != nums.end();) {
			if (*it == lastNum) {
				it = nums.erase(it);
			}
			else {
				lastNum = *it;
				++it;
			}
		}

		return nums.size();
	}
};
