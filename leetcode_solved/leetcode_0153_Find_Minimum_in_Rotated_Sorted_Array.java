// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
// Memory Usage: 42.5 MB, less than 8.03% of Java online submissions for Find Minimum in Rotated Sorted Array.
// binary search.
// T:O(logn), S:O(1)
// 
class Solution {
    public int findMin(int[] nums) {
        int len = nums.length, left = 0, right = len - 1, mid;
        if (len == 1) {
            return nums[0];
        }
        while (left < right) {
            mid = left + (right - left) / 2;
            if (mid == 0) {
                if (nums[mid] < nums[mid + 1]) {
                    if (nums[mid] < nums[len - 1]) {
                        return nums[mid];
                    } else {
                        left = mid + 1;
                    }
                } else {
                    return nums[mid + 1];
                }
            } else if (mid == len - 1) {
                if (nums[mid] > nums[mid - 1]) {
                    if (nums[mid] > nums[0]) {
                        return nums[0];
                    } else {
                        right = mid - 1;
                    }
                } else {
                    return nums[mid];
                }
            } else {
                if (nums[mid] < nums[mid + 1] && nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                }
                if (nums[mid] < nums[mid + 1]) {
                    if (nums[mid] < nums[len - 1]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    return nums[mid + 1];
                }
            }
        }

        return nums[left];
    }
}