// AC: Runtime 1 ms Beats 100%
// Memory 40.5 MB Beats 80%
// Brute-force.
// T:O(n^3), S:O(1)
// 
class Solution {
    public int minimumSum(int[] nums) {
        int len = nums.length, ret = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (nums[j] > nums[i] && nums[j] > nums[k]) {
                        ret = Math.min(ret, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }

        return ret == Integer.MAX_VALUE ? -1 : ret;
    }
}
