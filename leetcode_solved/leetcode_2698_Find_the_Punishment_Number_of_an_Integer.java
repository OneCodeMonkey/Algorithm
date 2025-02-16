// Runtime 5 ms Beats 98.43% 
// Memory 40.90 MB Beats 82.76%
// Recursion & some tricky.
// T:O(n * (2^logn)), S:O(1)
// 
class Solution {
    public int punishmentNumber(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            if (canPart(i * i, i)) {
                ret += i * i;
            }
        }

        return ret;
    }

    private boolean canPart(int square, int i) {
        if (i < 0 || square < i) {
            return false;
        }
        if (square == i) {
            return true;
        }

        return canPart(square / 10, i - (square % 10)) || canPart(square / 100, i - (square % 100))
                || canPart(square / 1000, i - (square % 1000));
    }
}
