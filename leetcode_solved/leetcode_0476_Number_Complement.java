// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Number Complement.
// Memory Usage: 35.1 MB, less than 99.88% of Java online submissions for Number Complement.
// 略
// T:O(log2(n)), S:O(1)
// 
class Solution {
    public int findComplement(int num) {
        int ret = 0, base = 1;
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            ret += (num % 2 == 0 ? 1 : 0) * base;
            num = num >> 1;
            base *= 2;
        }
        return ret;
    }
}