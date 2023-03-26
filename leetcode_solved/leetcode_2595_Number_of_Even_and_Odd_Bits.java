// AC: Runtime 1 ms Beats 99.95% 
// Memory 42.1 MB Beats 96.49%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int[] evenOddBit(int n) {
        int[] ret = new int[2];
        int pos = 0, countOneOnEvenIndex = 0, countOneOnOddIndex = 0;
        while (n > 0) {
            int digit = n % 2;
            if (digit == 1) {
                if (pos % 2 == 0) {
                    countOneOnEvenIndex++;
                } else {
                    countOneOnOddIndex++;
                }
            }
            n /= 2;
            pos++;
        }

        ret[0] = countOneOnEvenIndex;
        ret[1] = countOneOnOddIndex;
        return ret;
    }
}
