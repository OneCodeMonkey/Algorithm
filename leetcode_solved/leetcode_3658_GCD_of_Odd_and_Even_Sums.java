// Runtime 0 ms Beats 100.00% 
// Memory 40.68 MB Beats 95.91%
// GCD().
// T:O(logn), S:O(1)
// 
class Solution {
    public int gcdOfOddEvenSums(int n) {
        long oddSum = 0, evenSum = 0;
        oddSum = (long) n * n;
        evenSum = oddSum + n;

        return (int) gcd(oddSum, evenSum);
    }

    private long gcd(long a, long b) {
        if (a > b) {
            return gcd(b, a);
        }
        if (b % a == 0) {
            return a;
        }
        return gcd(b % a, a);
    }
}
