// Runtime 1 ms Beats 100.00%
// Memory 44.77 MB Beats 100.00%
// Brute-force.
// T:O(n * k), S:O(1)
// 
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        if (multiplier == 1) {
            return nums;
        }
        for (int i = 0; i < k; i++) {
            int min = (int) 1e10, minIndex = -1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = multiplier * min;
        }

        return nums;
    }
}
