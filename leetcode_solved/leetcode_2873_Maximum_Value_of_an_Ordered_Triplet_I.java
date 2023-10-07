// AC: Runtime 1 ms Beats 100% 
// Memory 40.4 MB Beats 100%
// Prefix array & brute-force O(n^2)
// T:O(n^2), S:O(n)
// 
class Solution {
    public long maximumTripletValue(int[] nums) {
        int len = nums.length;
        long ret = 0;
        int[] latterMax = new int[len];
        latterMax[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            latterMax[i] = Math.max(latterMax[i + 1], nums[i]);
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                if (nums[i] > nums[j]) {
                    ret = Math.max(ret, (long) (nums[i] - nums[j]) * latterMax[j + 1]);
                }
            }
        }

        return ret;
    }
}
