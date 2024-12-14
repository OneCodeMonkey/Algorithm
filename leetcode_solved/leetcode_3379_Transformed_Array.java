// Runtime 1 ms Beats 100.00% Analyze Complexity 
// Memory 44.76 MB Beats 100.00%
// Array.
// T:O(n), S:O(1)
//
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] ret = new int[len];
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                ret[i] = nums[i];
            } else if (nums[i] > 0) {
                int index = (i + nums[i]) % len;
                ret[i] = nums[index];
            } else if (nums[i] < 0) {
                int index = (i + nums[i]) < 0 ? (len + (i + nums[i]) % len) : (i + nums[i]);
                ret[i] = nums[index];
            }
        }

        return ret;
    }
}
