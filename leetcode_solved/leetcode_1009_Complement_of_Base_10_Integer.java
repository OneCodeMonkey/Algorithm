// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Complement of Base 10 Integer.
// Memory Usage: 35.9 MB, less than 40.76% of Java online submissions for Complement of Base 10 Integer.
// 略
// T:O(log2(n)), S:O(1)
// 
class Solution {
    public int bitwiseComplement(int n) {
        int ret = 0, base = 1;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            ret += (n % 2 == 0 ? 1 : 0) * base;
            n = n >> 1;
            base *= 2;
        }
        return ret;
    }
}