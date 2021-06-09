// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Smallest Range I.
// Memory Usage: 39.2 MB, less than 51.15% of Java online submissions for Smallest Range I.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i: nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return (max - min > 2 * k) ? (max - min - 2 * k) : 0;
    }
}