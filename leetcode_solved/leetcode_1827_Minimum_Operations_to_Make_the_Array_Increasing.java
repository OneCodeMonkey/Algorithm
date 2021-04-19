// AC:
// Runtime: 2 ms, faster than 100.00% of Java online submissions for Minimum Operations to Make the Array Increasing.
// Memory Usage: 39.4 MB, less than 100.00% of Java online submissions for Minimum Operations to Make the Array Increasing.
// 复杂度：T:O(n), S:O(1)
//
class Solution {
    public int minOperations(int[] nums) {
        int size = nums.length;
        int ret = 0;
        if (size <= 1) {
            return ret;
        }
        int lastElement = nums[0];
        for(int i = 1; i < size; i++) {
            if (nums[i] > lastElement) {
                lastElement = nums[i];
            } else {
                ret += (lastElement + 1 - nums[i]);
                lastElement += 1;
            }
        }
        return ret;
    }
}