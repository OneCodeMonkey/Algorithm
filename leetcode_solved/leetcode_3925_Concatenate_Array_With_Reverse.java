// Runtime 1 ms Beats 99.99% 
// Memory 47.09 MB Beats 98.12%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int len = nums.length;
        int[] ret = new int[2 * len];
        for (int i = 0; i < len; i++) {
            ret[i] = nums[i];
            ret[2 * len - 1 - i] = nums[i];
        }

        return ret;
    }
}
