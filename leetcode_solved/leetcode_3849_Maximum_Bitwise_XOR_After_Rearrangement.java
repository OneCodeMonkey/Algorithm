// Runtime 75 ms Beats 30.81% 
// Memory 54.99 MB Beats 66.52%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String maximumXor(String s, String t) {
        int len = t.length(), count1 = 0, count2 = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count1++;
            }
        }
        for (char c : t.toCharArray()) {
            if (c == '1') {
                count2++;
            }
        }
        StringBuilder ret = new StringBuilder();
        if (count1 + count2 >= len) {
            int extra = count1 + count2 - len;
            for (int i = len - 1; i >= 0; i--) {
                if (extra > 0) {
                    if (s.charAt(i) == '1') {
                        ret.append('0');
                        extra--;
                    } else {
                        ret.append('1');
                    }
                } else {
                    ret.append('1');
                }
            }

            return ret.reverse().toString();
        }
        int pos = count2;
        for (int i = 0; i < len; i++) {
            if (pos > 0) {
                if (s.charAt(i) != '1') {
                    pos--;
                }
                ret.append('1');
            } else {
                ret.append(s.charAt(i));
            }
        }

        return ret.toString();
    }
}
