// Runtime 1 ms Beats 100.00% 
// Memory 42.58 MB Beats 50.00%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public boolean validDigit(int n, int x) {
        int lastDigit = -1;
        boolean isContainDigit = false;
        while (n > 0) {
            int digit = n % 10;
            if (!isContainDigit && digit == x) {
                isContainDigit = true;
            }
            lastDigit = digit;
            n /= 10;
        }

        return isContainDigit && lastDigit != x;
    }
}
