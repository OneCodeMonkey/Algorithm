// Runtime 1 ms Beats 98.80% 
// Memory 46.50 MB Beats 39.33%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minMoves(int[] nums) {
        int len = nums.length, maxVal = 0, sum = 0;
        for (int i : nums) {
            sum += i;
            maxVal = Math.max(maxVal, i);
        }

        return maxVal * len - sum;
    }
}
