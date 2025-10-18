// Runtime 1 ms Beats 100.00% 
// Memory 55.87 MB Beats 29.14%
// Greedy.
// T:O(n), S:O(1)
// 
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int maxVal = 0, minVal = Integer.MAX_VALUE;
        for (int i : nums) {
            maxVal = Math.max(maxVal, i);
            minVal = Math.min(minVal, i);
        }

        return k * (long) (maxVal - minVal);
    }
}
