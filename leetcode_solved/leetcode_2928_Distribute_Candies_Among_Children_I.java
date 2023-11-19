// AC: Runtime Details 1ms Beats 100.00%of users with Java
// Memory Details 39.37MB Beats 60.00%of users with Java
// Brute-force
// T:O(n^2), S:O(1)
// 
class Solution {
    public int distributeCandies(int n, int limit) {
        int ret = 0;
        if (3 * limit >= n) {
            for (int i = 0; i <= limit; i++) {
                for (int j = 0; j <= limit; j++) {
                    if (i + j <= n && n - i - j <= limit) {
                        ret++;
                    }
                }
            }
        }
        return ret;
    }
}
