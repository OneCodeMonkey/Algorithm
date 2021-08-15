// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Non-Zero Product of the Array Elements.
// Memory Usage: 35.4 MB, less than 100.00% of Java online submissions for Minimum Non-Zero Product of the Array Elements.
// 思路：观察规律可以猜测，最小乘积时，除了 2^p - 1 外，剩下的最大值和最小值两两配对，形成 2^p - 2, 共 (2^p - 2) / 2 对。再计算 pow(x, y), 递归计算，复杂度降为 O(n), n 为原指数
// T:O(n), S:O(1)
// 
class Solution {
    public int minNonZeroProduct(int p) {
        long mod = 1000_000_000 + 7, divider = (1L << p) - 1;
        long powResult = myPow(divider - 1, (divider - 1) / 2, mod);
        int ret = (int) (((divider % mod) * powResult) % mod);
        return ret;
    }

    private long myPow(long x, long y, long mod) {
        if (y == 0) {
            return 1;
        }
        long temp = myPow(x, y / 2, mod);
        long p = (temp * temp) % mod;

        return y % 2 == 1 ? (p * (x % mod)) % mod : p;
    }
}