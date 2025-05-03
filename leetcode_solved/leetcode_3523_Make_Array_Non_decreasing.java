// Runtime 3 ms Beats 64.27% 
// Memory 72.73 MB Beats 71.33%
// Greedy & Monotonic.
// T:O(n), S:O(1)
// 
class Solution {
    public int maximumPossibleSize(int[] nums) {
        int ret = 0, prev = 0;
        for (int num : nums) {
            if (num > prev) {
                ret++;
                prev = num;
            } else if (num == prev) {
                ret++;
            }
        }

        return ret;
    }
}
