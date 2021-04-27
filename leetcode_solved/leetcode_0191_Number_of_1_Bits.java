// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
// Memory Usage: 36.3 MB, less than 11.14% of Java online submissions for Number of 1 Bits.
//
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return getOneBitCount(n);
    }

    private int getOneBitCount(int n) {
        int ret = 0;
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = -n - 1;
        }
        while (n > 0) {
            if (n % 2 == 1) {
                ret++;
            }
            n /= 2;
        }
        if (isNegative) {
            return 32 - ret;
        }
        return ret;
    }
}