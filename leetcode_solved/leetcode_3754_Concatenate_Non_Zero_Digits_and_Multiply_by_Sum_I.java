// Runtime 1 ms Beats 99.95% 
// Memory 42.23 MB Beats 99.95%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public long sumAndMultiply(int n) {
        long sumDigit = 0, exp = 1, cur = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > 0) {
                cur += digit * exp;
                exp *= 10;
            }
            sumDigit += digit;

            n /= 10;
        }

        return cur * sumDigit;
    }
}
