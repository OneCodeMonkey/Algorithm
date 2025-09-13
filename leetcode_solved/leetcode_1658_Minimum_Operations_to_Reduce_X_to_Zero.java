// Runtime 58 ms Beats 15.94% 
// Memory 61.92 MB Beats 54.01%
// Prefix sum.
// T:O(n), S:O(n)
// 
class Solution {
    public int minOperations(int[] nums, int x) {
        long totalSum = 0, curSum = 0;
        for (int i : nums) {
            totalSum += i;
        }
        if (totalSum < x) {
            return -1;
        }
        int len = nums.length, ret = 0;
        long targetSum = totalSum - x;
        HashMap<Long, Integer> prefixSumFirstIndex = new HashMap<>();
        prefixSumFirstIndex.put(0L, -1);
        for (int i = 0; i < len; i++) {
            curSum += nums[i];
            if (prefixSumFirstIndex.containsKey(curSum - targetSum)) {
                int len1 = i - prefixSumFirstIndex.get(curSum - targetSum);
                ret = Math.max(ret, len1);
            }
            prefixSumFirstIndex.put(curSum, i);
        }

        return len - ret;
    }
}
