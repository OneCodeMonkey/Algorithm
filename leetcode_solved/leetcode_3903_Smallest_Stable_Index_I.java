// Runtime 1 ms Beats 100.00% 
// Memory 46.38 MB Beats 64.14%
// Prefix sum.
// T:O(n), S:O(n)
// 
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length, curMin = Integer.MAX_VALUE;
        int[] smallVal = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            curMin = Math.min(curMin, nums[i]);
            smallVal[i] = curMin;
        }
        int curMax = -1;
        for (int i = 0; i < n; i++) {
            curMax = Math.max(curMax, nums[i]);
            curMin = smallVal[i];
            if (curMax - curMin <= k) {
                return i;
            }
        }

        return -1;
    }
}
