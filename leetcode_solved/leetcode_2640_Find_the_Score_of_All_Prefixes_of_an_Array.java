// AC: Runtime 3 ms Beats 100% 
// Memory 72.4 MB Beats 100%
// Array.
// T:O(n), S:O(n)
// 
class Solution {
    public long[] findPrefixScore(int[] nums) {
        int len = nums.length, curMax = 0;
        int[] conversion = new int[len];
        long prefixSum = 0;
        long[] ret = new long[len];
        for (int i = 0; i < len; i++) {
            curMax = Math.max(curMax, nums[i]);
            conversion[i] = nums[i] + curMax;
            prefixSum += conversion[i];
            ret[i] = prefixSum;
        }

        return ret;
    }
}
