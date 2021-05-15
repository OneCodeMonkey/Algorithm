// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Largest Number At Least Twice of Others.
// Memory Usage: 36.7 MB, less than 72.74% of Java online submissions for Largest Number At Least Twice of Others.
// 略
// T:O(n), S:O(1)
//
class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0, maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for (Integer item: nums) {
            if (item != max) {
                if (item * 2 > max) {
                    return -1;
                }
            }
        }
        return maxIndex;
    }
}