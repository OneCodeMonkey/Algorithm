// Runtime 33 ms Beats 33.52% 
// Memory 132.25 MB Beats 5.60%
// Greedy.
// T:O(n + logn), S:O(1)
// 
class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ret = 0;
        int len = nums.length, half = len / 2;
        for (int i = 0; i < len; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (i < half) {
                ret -= (long) nums[i] * nums[i];
            } else {
                ret += (long) nums[i] * nums[i];
            }
        }

        return ret;
    }
}
