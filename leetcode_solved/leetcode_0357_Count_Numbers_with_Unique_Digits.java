// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Numbers with Unique Digits.
// Memory Usage: 35.9 MB, less than 48.96% of Java online submissions for Count Numbers with Unique Digits.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int base = 9, ret = 10;
        if (n == 0) {
            return 1;
        }
        for (int i = 2; i <= n && i <= 10; i++) {
            base *= (11 - i);
            ret += base;
        }

        return ret;
    }
}