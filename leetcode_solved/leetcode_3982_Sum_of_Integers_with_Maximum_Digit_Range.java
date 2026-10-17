// Runtime 2 ms Beats 41.51% 
// Memory 45.19 MB Beats 81.53%
// .
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxDiff = 0, ret = 0;
        for (int i : nums) {
            maxDiff = Math.max(maxDiff, getDigitRange(i));
        }
        for (int i : nums) {
            if (getDigitRange(i) == maxDiff) {
                ret += i;
            }
        }

        return ret;
    }

    private int getDigitRange(int i) {
        int minDigit = 10, maxDigit = -1;
        while (i > 0) {
            int d = i % 10;
            minDigit = Math.min(minDigit, d);
            maxDigit = Math.max(maxDigit, d);
            i /= 10;
        }

        return maxDigit - minDigit;
    }
}
