// Runtime 0 ms Beats 100.00% 
// Memory 42.54 MB Beats 35.92%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int largestInteger(int n, int s) {
        if (s == 0) {
            return 0;
        } else if (s > n * 9) {
            return -1;
        }
        if (n == 1) {
            return Math.min(9, s);
        }

        int[] ret = new int[n];
        int pos = 0;
        while (pos < n) {
            int digit = Math.min(s, 9);
            ret[pos++] = digit;
            s -= digit;
        }
        int retVal = 0, exp = 1;
        for (int i = n - 1; i >= 0; i--) {
            retVal += ret[i] * exp;
            exp *= 10;
        }

        return retVal;
    }
}
