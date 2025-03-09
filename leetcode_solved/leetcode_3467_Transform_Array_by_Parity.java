// Runtime 1 ms Beats 100.00% 
// Memory 44.79 MB Beats 97.81%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] transformArray(int[] nums) {
        int len = nums.length, countOdd = 0;
        for (int i : nums) {
            if (i % 2 == 1) {
                countOdd++;
            }
        }
        int[] ret = new int[len];
        for (int i = len - countOdd; i < len; i++) {
            ret[i] = 1;
        }

        return ret;
    }
}
