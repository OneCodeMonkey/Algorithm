// AC: Runtime 3 ms Beats 97.49% 
// Memory 122.70 MB Beats 50.74%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public long maximumScore(int[] nums) {
        int len = nums.length, curMin = Integer.MAX_VALUE;
        long ret = 0, curSum = nums[0];
        int[] suffixMin = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            curMin = Math.min(curMin, nums[i]);
            suffixMin[i] = curMin;
        }
        ret = curSum - suffixMin[1];
        for (int i = 1; i < nums.length - 1; i++) {
            curSum += nums[i];
            ret = Math.max(ret, curSum - suffixMin[i + 1]);
        }

        return ret;
    }
}
