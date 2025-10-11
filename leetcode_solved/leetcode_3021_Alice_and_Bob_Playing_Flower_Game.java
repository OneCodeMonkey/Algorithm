// Runtime 0 ms Beats 100.00% 
// Memory 41.00 MB Beats 29.19%
// Math.
// T:O(1), S:O(1)
// 
class Solution {
    public long flowerGame(int n, int m) {
        long ret = 0;
        int n1 = n % 2 == 0 ? (n / 2) : ((n + 1) / 2), m1 = m % 2 == 0 ? (m / 2) : ((m + 1) / 2);
        ret += n / 2L * m1 + n1 * (m / 2L);

        return ret;
    }
}
