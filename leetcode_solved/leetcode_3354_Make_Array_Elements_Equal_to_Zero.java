// Runtime 0 ms Beats 100.00%
// Memory 42.40 MB Beats 100.00%
// Find the element 0 where left sum and right sum diff <= 1. If diff = 0, answer contributes 2, else contributes 1.
// T:O(n), S:O(1)
// 
class Solution {
    public int countValidSelections(int[] nums) {
        int ret = 0, sum = 0, cur = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int num : nums) {
            if (num == 0) {
                if (sum % 2 == 0 && cur == sum / 2) {
                    ret += 2;
                } else if (sum % 2 == 1 && (cur == sum / 2 || cur == (sum / 2 + 1))) {
                    ret++;
                }
            }
            cur += num;
        }

        return ret;
    }
}
