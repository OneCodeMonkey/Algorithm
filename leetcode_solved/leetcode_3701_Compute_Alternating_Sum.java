// Runtime 1 ms Beats 100.00% 
// Memory 44.14 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int alternatingSum(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret += (i % 2 == 0 ? nums[i] : -nums[i]);
        }

        return ret;
    }
}
