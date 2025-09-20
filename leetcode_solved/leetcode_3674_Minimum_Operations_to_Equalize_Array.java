// Runtime 1 ms Beats 100.00% 
// Memory 43.78 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length;
        if (len > 1) {
            boolean allEqual = true;
            for (int i = 1; i < len; i++) {
                if (nums[i] != nums[0]) {
                    allEqual = false;
                    break;
                }
            }
            return allEqual ? 0 : 1;
        }

        return 0;
    }
}
