// Runtime 1 ms Beats 99.78% 
// Memory 44.79 MB Beats 99.87%
// Sort.
// T:O(n), S:O(1)
// 
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int len = nums.length, maxVal1 = Integer.MIN_VALUE, maxVal2 = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
        for (int i : nums) {
            minVal = Math.min(minVal, i);
            if (i > maxVal1) {
                if (i >= maxVal2) {
                    int t = maxVal2;
                    maxVal2 = i;
                    maxVal1 = t;
                } else {
                    maxVal1 = i;
                }
            }
        }

        return maxVal1 + maxVal2 - minVal;
    }
}
