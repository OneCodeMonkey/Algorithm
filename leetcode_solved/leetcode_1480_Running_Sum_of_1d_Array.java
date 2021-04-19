// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
// Memory Usage: 39 MB, less than 70.99% of Java online submissions for Running Sum of 1d Array.
// 
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0, size = nums.length;
        int[] ret = new int[size];
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            ret[i] = sum;
        }
        return ret;
    }
}