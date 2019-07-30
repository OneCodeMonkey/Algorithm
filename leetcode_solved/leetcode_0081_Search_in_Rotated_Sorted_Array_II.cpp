class Solution {
public:
	/**
	 * AC:
	 * Runtime: 8 ms, faster than 69.71% of C++ online submissions for Search in Rotated Sorted Array II.
	 * Memory Usage: 8.5 MB, less than 98.18% of C++ online submissions for Search in Rotated Sorted Array II.
	 *
	 * @see  ./leetcode_33_Search_in_Rotated_Sorted_Array.cpp
	 * 思路：和 leetcode_33_Search_in_Rotated_Sorted_Array 一样。只需每次循环前，做两端的去重就行了。
	 * 其余情形等同于 Search_in_Rotated_Sorted_Array
	 */
    bool search(vector<int>& nums, int target) {
        int l = 0;
        int r = nums.size() - 1;
        while(l <= r) {
            while(l < r && nums[l] == nums[l + 1]) l++;
            while(l < r && nums[r] == nums[r - 1]) r--;

            int mid = l + (r - l) / 2;	// 中间点

            if(nums[mid] == target) {
                return true;
            }

            if(nums[l] < nums[mid]) {	// [l，mid] 段是排好序的。
                if(target >= nums[l] && target <= nums[mid]) {	// target 可能在 [l, mid]
                    r = mid - 1;
                } else {
                    l = mid + 1;		// 转向右半边
                }
            } else if(nums[l] == nums[mid]) {   // l - r == 1 的情况，即此时只有2个元素
                return nums[r] == target ? r : false;
            } else {	// [mid, r] 段是排好序的
                if(target >= nums[mid] && target <= nums[r]) {	// target 可能在 [mid, r]
                    l = mid + 1;
                } else {
                    r = mid - 1;		// 转向左半边
                }
            }
        }

        return false;		// 查找失败
    }
};
