class Solution {
public:
    bool search(vector<int>& nums, int target) {
        int l = 0;
    	int r = nums.size() - 1;
    	while(l <= r) {
    		int mid = l + (r - l) / 2;	// 中间点
    		while(l < r && nums[l] == nums[l + 1]) l++;
    		while(l < r && nums[r] == nums[r - 1]) r--;
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
