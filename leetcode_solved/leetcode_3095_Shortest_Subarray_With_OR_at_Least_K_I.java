// Runtime 1 ms Beats 100.00% of users with Java
// Memory 41.96 MB Beats 100.00% of users with Java
// Brute-force.
// T:O(n ^ 2), S:O(1)
// 
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int len = nums.length;
        int orSum = 0, ret = len + 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= k) {
                return 1;
            }
            orSum = nums[i];
            for (int j = i + 1; j < len; j++) {
                orSum |= nums[j];
                if (orSum >= k) {
                    ret = Math.min(ret, j - i + 1);
                    break;
                }
            }
        }

        return ret == len + 1 ? -1 : ret;
    }
}
