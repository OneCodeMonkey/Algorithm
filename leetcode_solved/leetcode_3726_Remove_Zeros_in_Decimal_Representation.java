// Runtime 1 ms Beats 100.00% 
// Memory 41.42 MB Beats 100%
// .
// T:O(logn), S:O(logn)
// 
class Solution {
    public long removeZeros(long n) {
        StringBuilder ret = new StringBuilder();
        while (n > 0) {
            int digit = (int) (n % 10);
            if (digit > 0) {
                ret.append(digit);
            }
            n /= 10;
        }

        return Long.parseLong(ret.reverse().toString());
    }
}
