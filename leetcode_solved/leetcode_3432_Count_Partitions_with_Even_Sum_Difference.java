// Runtime 0 ms Beats 100.00%
// Memory 41.89 MB Beats 87.69%
// .
// T:O(1), S:O(n)
// 
class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0, cur = 0, ret = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            cur += nums[i];
            if ((sum - 2 * cur) % 2 == 0) {
                ret++;
            }
        }

        return ret;
    }
}
