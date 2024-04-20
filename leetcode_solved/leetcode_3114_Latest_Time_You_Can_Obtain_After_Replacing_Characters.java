// Runtime 1 ms Beats 100.00% of users with Java
// Memory 42.33 MB Beats 100.00% of users with Java
// .
// T:O(1), S:O(1)
// 
class Solution {
    public String findLatestTime(String s) {
        if (s.contains("?")) {
            StringBuilder ret = new StringBuilder();
            if (s.charAt(4) == '?') {
                ret.append('9');
            } else {
                ret.append(s.charAt(4));
            }
            if (s.charAt(3) == '?') {
                ret.append('5');
            } else {
                ret.append(s.charAt(3));
            }
            ret.append(':');
            char c1 = s.charAt(0), c2 = s.charAt(1);
            if (c1 == '?') {
                if (c2 != '?' && c2 > '1') {
                    c1 = '0';
                } else {
                    c1 = '1';
                }
            }
            if (c1 == '1') {
                if (c2 == '?') {
                    c2 = '1';
                }
            } else {
                if (c2 == '?') {
                    c2 = '9';
                }
            }

            ret.append(c2);
            ret.append(c1);

            return ret.reverse().toString();
        }

        return s;
    }
}
