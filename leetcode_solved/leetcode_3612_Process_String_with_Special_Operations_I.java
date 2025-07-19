// Runtime 4 ms Beats 100.00% 
// Memory 54.21 MB Beats 100.00%
// .
// T:O(n) ~ O(n^2), S:O(n)
// 
class Solution {
    public String processStr(String s) {
        StringBuilder ret = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (ret.length() > 0) {
                    ret.deleteCharAt(ret.length() - 1);
                }
            } else if (c == '#') {
                if (ret.length() > 0) {
                    ret.append(ret.toString());
                }
            } else if (c == '%') {
                ret.reverse();
            } else {
                ret.append(c);
            }
        }

        return ret.toString();
    }
}
