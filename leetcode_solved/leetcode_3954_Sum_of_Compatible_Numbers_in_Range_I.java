// Runtime 1 ms Beats 100.00% 
// Memory 42.55 MB Beats 78.94%
// brute-force.
// T:O(k), S:O(1)
// 
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int ret = 0;
        for (int i = Math.max(0, n - k); i <= n + k; i++) {
            if ((n & i) == 0) {
                ret += i;
            }
        }

        return ret;
    }
}
