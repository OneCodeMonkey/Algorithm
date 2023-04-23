// AC: Runtime 4 ms Beats 66.67% 
// Memory 39.1 MB Beats 100%
// Brute-force
// T:O(n), S:O(1)
// 
class Solution {
    public int sumOfMultiples(int n) {
        int ret = 0;
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                ret += i;
            }
        }

        return ret;
    }
}