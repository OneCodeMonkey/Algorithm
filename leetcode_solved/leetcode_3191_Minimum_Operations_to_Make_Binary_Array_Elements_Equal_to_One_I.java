// Runtime 8 ms Beats 100.00%
// Memory 57.32 MB Beats 100.00%
// Greedy. Make flip from the start of the array. Once find not 1, the operation is failed.
// T:O(n), S:O(1)
// 
class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length, ret = 0;
        for (int i = 0; i + 2 < len; i++) {
            if (nums[i] == 0) {
                for (int j = i; j <= i + 2; j++) {
                    nums[j] = (nums[j] == 0) ? 1 : 0;
                }
                ret++;
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                return -1;
            }
        }

        return ret;
    }
}
