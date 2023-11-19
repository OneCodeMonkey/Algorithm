// AC: Runtime Details 2ms Beats 100.00%of users with Java
// Memory Details 42.82MB Beats 100.00%of users with Java
// Brute-force
// T:O(n^2), S:O(1)
//
class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ret = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    ret = Math.max(ret, nums[i] ^ nums[j]);
                }
            }
        }
        return ret;
    }
}
