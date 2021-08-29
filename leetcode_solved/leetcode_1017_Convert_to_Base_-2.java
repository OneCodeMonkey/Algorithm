// AC: Runtime: 1 ms, faster than 63.70% of Java online submissions for Convert to Base -2.
// Memory Usage: 38.5 MB, less than 6.67% of Java online submissions for Convert to Base -2.
// some tricks to use bit manipulation
// T:O(logn), S:O(logn)
//
class Solution {
    public String baseNeg2(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        while (n != 0) {
            ret.append(n & 1);
            n = -(n >> 1);
        }

        return ret.reverse().toString();
    }
}