// Runtime 1 ms Beats 100.00% 
// Memory 44.11 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int len = nums.length, ret = 0;
        for (int i = 0; i < len; i++) {
            if ((i - k < 0 || (i - k >= 0 && nums[i] > nums[i - k])) &&
                    (i + k >= len || (i + k < len && nums[i] > nums[i + k]))) {
                ret += nums[i];
            }
        }

        return ret;
    }
}
