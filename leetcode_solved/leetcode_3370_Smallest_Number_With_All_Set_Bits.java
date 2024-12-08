// Runtime 0 ms Beats 100.00%
// Memory 40.82 MB Beats 100.00%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int smallestNumber(int n) {
        int ret = 0, exp = 0, base = 1;
        while (n > 0) {
            exp++;
            n /= 2;
        }
        for (int i = 0; i < exp; i++) {
            ret += base;
            base *= 2;
        }

        return ret;
    }
}
