// AC: Runtime: 1 ms, faster than 99.93% of Java online submissions for Maximum Product Difference Between Two Pairs.
// Memory Usage: 39.1 MB, less than 77.23% of Java online submissions for Maximum Product Difference Between Two Pairs.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int maxProductDifference(int[] nums) {
        int max1 = 0, max2 = 0, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i: nums) {
            if (i > max1) {
                if (max1 != 0) {
                    max2 = max1;
                }
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }

            if (i < min2) {
                if (min1 != 0) {
                    min1 = min2;
                }
                min2 = i;
            } else if (i < min1) {
                min1 = i;
            }
        }

        return max1 * max2 - min1 * min2;
    }
}