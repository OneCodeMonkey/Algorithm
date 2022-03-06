// AC: Runtime: 1 ms, faster than 54.21% of Java online submissions for Count All Valid Pickup and Delivery Options.
// Memory Usage: 40.5 MB, less than 48.60% of Java online submissions for Count All Valid Pickup and Delivery Options.
// this is a combination and permutation problem. which answer is P(n, 1) * (3 * 5 * ... * (2n - 1))
// T:O(n), S:O(1)
// 
class Solution {
    public int countOrders(int n) {
        long ret = 1, mod = (int) (1e9 + 7);
        for (int i = n; i >= 1; i--) {
            ret *= i;
            ret %= mod;
        }
        for (int i = 1; i <= n - 1; i++) {
            ret *= 2L * i + 1;
            ret %= mod;
        }

        return (int) ret;
    }
}