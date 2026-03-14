// Runtime 1 ms Beats 100.00% 
// Memory 46.83 MB Beats 96.85%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int scoreDifference(int[] nums) {
        int sign = 1, sumFirst = 0, sumSecond = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                sign = sign == 1 ? -1 : 1;
            }
            if (i % 6 == 5) {
                sign = sign == 1 ? -1 : 1;
            }
            if (sign > 0) {
                sumFirst += nums[i];
            } else {
                sumSecond += nums[i];
            }
        }

        return sumFirst - sumSecond;
    }
}
