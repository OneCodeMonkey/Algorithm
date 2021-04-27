// Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
// Memory Usage: 38.7 MB, less than 89.08% of Java online submissions for Excel Sheet Column Number.
//
class Solution {
    public int titleToNumber(String columnTitle) {
        int ret = 0, size = columnTitle.length(), temp;
        for (int i = 0; i < size; i++) {
            temp = (columnTitle.charAt(i) - 'A') + 1;
            ret += temp * (int)Math.pow(26, (size - 1 - i));
        }
        return ret;
    }
}