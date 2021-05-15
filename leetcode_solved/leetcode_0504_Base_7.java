// AC:
// Runtime: 1 ms, faster than 83.03% of Java online submissions for Base 7.
// Memory Usage: 36.4 MB, less than 56.72% of Java online submissions for Base 7.
// .
// T:O(log10(n)), S:O(log10(n))
//
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        int num2 = num;
        if (num < 0) {
            num2 = -num;
        }
        while (num2 > 0) {
            ret.append(num2 % 7);
            num2 /= 7;
        }
        if (num < 0) {
            ret.append('-');
            return ret.reverse().toString();
        }
        return ret.reverse().toString();
    }
}