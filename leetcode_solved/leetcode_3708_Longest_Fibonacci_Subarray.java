// Runtime 1 ms Beats 100.00% 
// Memory 58.24 MB Beats 67.43%
// Greedy.
// T:O(n), S:O(1)
// 
class Solution {
    public int longestSubarray(int[] nums) {
        int len = nums.length, cur = 0, ret = 2;
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] + nums[i + 1] == nums[i + 2]) {
                if (cur > 0) {
                    cur++;
                } else {
                    cur = 1;
                }

                ret = Math.max(ret, cur + 2);
            } else {
                cur = 0;
            }
        }

        return ret;
    }
}
