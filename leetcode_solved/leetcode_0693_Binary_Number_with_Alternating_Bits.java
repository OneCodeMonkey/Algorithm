// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Number with Alternating Bits.
// Memory Usage: 35.2 MB, less than 99.86% of Java online submissions for Binary Number with Alternating Bits.
// 略。
// T:O(log2(n)), S:O(1)
// 
class Solution {
    public boolean hasAlternatingBits(int n) {
        int previousBit = -1;
        while (n > 0) {
            if (n % 2 == previousBit) {
                return false;
            }
            previousBit = n % 2;
            n = n >> 1;
        }
        return true;
    }
}