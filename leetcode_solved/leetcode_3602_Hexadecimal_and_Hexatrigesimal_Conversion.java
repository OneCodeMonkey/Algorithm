// Runtime 2 ms Beats 100.00% 
// Memory 42.12 MB Beats 100.00%
// Hexadecimal.
// T:O(logn), S:O(logn)
// 
class Solution {
    public String concatHex36(int n) {
        StringBuilder ret = new StringBuilder(), tmp = new StringBuilder();
        int n2 = n * n, n3 = n * n * n;
        while (n2 > 0) {
            int digit = n2 % 16;
            if (digit > 9) {
                tmp.append((char) ((digit - 10) + 'A'));
            } else {
                tmp.append((char) (digit + '0'));
            }
            n2 /= 16;
        }
        ret.append(tmp.reverse());
        tmp = new StringBuilder();
        while (n3 > 0) {
            int digit = n3 % 36;
            if (digit > 9) {
                tmp.append((char) ((digit - 10) + 'A'));
            } else {
                tmp.append((char) (digit + '0'));
            }
            n3 /= 36;
        }
        ret.append(tmp.reverse());

        return ret.toString();
    }
}
