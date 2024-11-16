// Runtime 1 ms Beats 100.00%
// Memory 44.36 MB Beats 100.00%
// Array.
// T:O(n), S:O(1)
// 
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1) {
            return true;
        }
        int len = nums.size(), cur = 1, prevIncrLen = 0;
        for (int i = 1; i < len; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                cur++;
                if (cur >= 2 * k || (cur >= k && prevIncrLen >= k)) {
                    return true;
                }
            } else {
                if (cur >= k && prevIncrLen >= k) {
                    return true;
                }
                prevIncrLen = cur;
                cur = 1;
            }
        }

        return false;
    }
}
