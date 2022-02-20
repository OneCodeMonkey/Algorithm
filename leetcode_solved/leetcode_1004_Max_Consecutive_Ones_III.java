// AC: Runtime: 4 ms, faster than 55.24% of Java online submissions for Max Consecutive Ones III.
// Memory Usage: 73.1 MB, less than 6.65% of Java online submissions for Max Consecutive Ones III.
// sliding window.
// T:O(n), S:O(1)
// 
class Solution {
    public int longestOnes(int[] nums, int k) {
        int  zeroCount = 0,leftPos = 0,  ret = 0;
        for (int i = 0; i < nums.length; i++) {
            zeroCount += nums[i] == 0 ? 1 : 0;
            while (zeroCount > k) {
                zeroCount -= nums[leftPos++] == 0 ? 1 : 0;
            }
            ret = Math.max(ret, i - leftPos + 1);
        }

        return ret;
    }
}