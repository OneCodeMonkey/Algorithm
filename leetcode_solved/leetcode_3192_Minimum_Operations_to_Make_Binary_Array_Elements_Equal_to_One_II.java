// Runtime 6 ms Beats 100.00% 
// Memory 57.19 MB Beats 100.00%
// Greedy. Starting from the end of array, try to flip continous subarray to 1s as possible.
// T:O(n), S:O(1)
// 
class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length, ret = 0, prev = nums[len - 1];
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                if (prev == 1) {
                    ret += 1;
                    prev = 0;
                }
                if (i == 0) {
                    ret += 1;
                }
            } else {
                if (prev == 0) {
                    ret += 1;
                    prev = 1;
                }
            }
        }

        return ret;
    }
}
