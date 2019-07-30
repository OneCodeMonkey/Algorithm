class Solution {
public:
	/**
	 * AC：
	 * Runtime: 0 ms, faster than 100.00% of C++ online submissions for Search in Rotated Sorted Array.
	 * Memory Usage: 8.7 MB, less than 55.62% of C++ online submissions for Search in Rotated Sorted Array.
	 *
	 * 思路：这是一个经典的二分查找的变形。但我们不能先试着遍历去找出这个旋转的点，因为这样就是 O(n),我们要用更高效的方法去查找。
	 * 如何二分查找呢？我们注意到一点，无论我们选择那个点做中间点，他都会有半边是已排序好的。
	 * 例如：
	 *		4, 5, 6, 7, 0, 1, 2
	 * 选择7做中间点，那么判断 a[0] = 4 < 7 = a[3]，成立。则我们知道 [a[0], a[3]] 段是排序好的，
	 * 这时只需要再判断 target 是否在[a[0], a[3]]，就可做出判断。
	 * 满足就在这半边，不满足，则 l = mid + 1, r 不变。即转向另外一遍，继续做这样的判断。
	 */
    int search(vector<int>& nums, int target) {
    	int l = 0;
    	int r = nums.size() - 1;
    	while(l <= r) {
    		int mid = l + (r - l) / 2;	// 中间点
    		if(nums[mid] == target) {
    			return mid;
    		}

    		if(nums[l] < nums[mid]) {	// [l，mid] 段是排好序的。
    			if(target >= nums[l] && target <= nums[mid]) {	// target 可能在 [l, mid]
    				r = mid - 1;
    			} else {
    				l = mid + 1;		// 转向右半边
    			}
    		} else if(nums[l] == nums[mid]) {   // l - r == 1 的情况，即此时只有2个元素
                return nums[r] == target ? r : -1;
            } else {	// [mid, r] 段是排好序的
    			if(target >= nums[mid] && target <= nums[r]) {	// target 可能在 [mid, r]
    				l = mid + 1;
    			} else {
    				r = mid - 1;		// 转向左半边
    			}
    		}
    	}

    	return -1;		// 查找失败
    }
};
