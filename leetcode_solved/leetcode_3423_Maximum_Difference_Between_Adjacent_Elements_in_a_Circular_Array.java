// Runtime 1 ms Beats 100.00%
// Memory 43.57 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length, ret = Math.abs(nums[0] - nums[len - 1]);
        for (int i = 0; i < len - 1; i++) {
            ret = Math.max(ret, Math.abs(nums[i] - nums[i + 1]));
        }

        return ret;
    }
}

