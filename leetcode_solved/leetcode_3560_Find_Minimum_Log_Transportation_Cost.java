// Runtime 0 ms Beats 100.00% 
// Memory 41.33 MB Beats 14.62%
// Greedy.
// T:O(n/k), S:O(1)
// 
class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long ret = 0;
        while (n > k) {
            ret += (long) (n - k) * k;
            n -= k;
        }
        while (m > k) {
            ret += (long) (m - k) * k;
            m -= k;
        }

        return ret;
    }
}
