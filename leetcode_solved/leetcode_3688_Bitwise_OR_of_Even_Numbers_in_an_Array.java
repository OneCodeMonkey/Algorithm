// Runtime 0 ms Beats 100.00% 
// Memory 42.73 MB Beats 80.29%
// Bit manipulation
// T:O(n), S:O(1)
// 
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ret = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                ret |= i;
            }
        }

        return ret;
    }
}
