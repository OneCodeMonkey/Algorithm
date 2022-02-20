// AC: Runtime: 1 ms, faster than 99.97% of Java online submissions for Minimum Size Subarray Sum.
// Memory Usage: 45.6 MB, less than 5.95% of Java online submissions for Minimum Size Subarray Sum.
// sliding window.
// T:O(n), S:O(1)
// 
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int leftPos = 0, ret = Integer.MAX_VALUE, curSum = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            if (curSum >= target) {
                flag = true;
                while (curSum >= target) {
                    curSum -= nums[leftPos++];
                }
                ret = Math.min(ret, i - leftPos + 2);
            }
        }

        return flag ? ret : 0;
    }
}