// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
// Memory Usage: 38.3 MB, less than 68.34% of Java online submissions for Find Minimum in Rotated Sorted Array.
// 思路：找到原有序数组的起点即可。
// 复杂度：T: O(n), S: O(1)
class Solution {
    public int findMin(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                return nums[i + 1];
            }
        }

        return nums[0];
    }
}