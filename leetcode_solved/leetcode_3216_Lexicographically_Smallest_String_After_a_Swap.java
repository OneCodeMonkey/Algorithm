// Runtime 1 ms Beats 100.00%
// Memory 43.04 MB Beats 100.00%
// String.
// T:O(n), S:O(n)
// 
class Solution {
    public String getSmallestString(String s) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            int digit1 = s.charAt(i) - '0', digit2 = s.charAt(i + 1) - '0';
            if (Math.abs(digit1 - digit2) % 2 == 0) {
                if (digit1 > digit2) {
                    ret.append(digit2);
                    ret.append(digit1);
                    if (i + 1 < s.length() - 1) {
                        ret.append(s.substring(i + 2));
                    }
                    return ret.toString();
                } else {
                    ret.append(s.charAt(i));
                }
            } else {
                ret.append(s.charAt(i));
            }
        }
        ret.append(s.charAt(s.length() - 1));

        return ret.toString();
    }
}
