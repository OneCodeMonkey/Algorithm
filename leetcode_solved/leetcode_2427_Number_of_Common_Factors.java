// AC: Runtime 1 ms Beats 100% 
// Memory 41 MB Beats 75%
// Travel through factors.
// T:O(Math.min(a, b)), S:O(1)
// 
class Solution {
    public int commonFactors(int a, int b) {
        int ret = 0, step = 1;
        if (a % 2 != 0 || b % 2 != 0) {
            step = 2;
        }
        for (int i = 1; i <= Math.min(a, b); i += step) {
            if (a % i == 0 && b % i == 0) {
                ret++;
            }
        }

        return ret;
    }
}
