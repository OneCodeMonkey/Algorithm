// Runtime 1 ms Beats 99.70% 
// Memory 46.54 MB Beats 34.79%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int minimumSwaps(int[] nums) {
        int countZero = 0;
        for (int i : nums) {
            if (i == 0) {
                countZero++;
            }
        }
        if (countZero == 0) {
            return 0;
        }
        int countTailZero = 0;
        for (int i = nums.length - 1; i >= nums.length - countZero; i--) {
            if (nums[i] == 0) {
                countTailZero++;
            }
        }

        return countZero - countTailZero;
    }
}
