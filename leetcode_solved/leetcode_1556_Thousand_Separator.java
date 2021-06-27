// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Thousand Separator.
// Memory Usage: 36.4 MB, less than 49.43% of Java online submissions for Thousand Separator.
// .
// T:O(log10(n)), S:O(1)
// 
class Solution {
    public String thousandSeparator(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        int exp = 0;
        while (n > 0) {
            int bit = n % 10;
            if (exp > 0 && exp % 3 == 0) {
                ret.append('.');
            }
            ret.append(bit);
            exp++;
            n /= 10;
        }
        return ret.reverse().toString();
    }
}
