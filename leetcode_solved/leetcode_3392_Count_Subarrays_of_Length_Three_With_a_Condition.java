// Runtime 1 ms Beats 100.00%
// Memory 45.19 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int countSubarrays(int[] nums) {
        int len = nums.length, ret = 0;
        for (int i = 0; i < len - 2; i++) {
            if ((nums[i] + nums[i + 2]) * 2 == nums[i + 1]) {
                ret++;
            }
        }

        return ret;
    }
}
