// AC: Runtime: 1 ms, faster than 57.86% of Java online submissions for Find Minimum in Rotated Sorted Array II.
// Memory Usage: 43.5 MB, less than 8.64% of Java online submissions for Find Minimum in Rotated Sorted Array II.
// when nums[mid] == nums[right], we cannot decide whether nums[mid] is smallest, and have to continue move left.
// T:O(n), S:O(1)
// 
class Solution {
    public int findMin(int[] nums) {
        int len = nums.length, left = 0, right = len - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return nums[right];
    }
}