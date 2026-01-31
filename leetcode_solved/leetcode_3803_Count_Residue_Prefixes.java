// Runtime 1 ms Beats 99.96% 
// Memory 43.81 MB Beats 94.41%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int residuePrefixes(String s) {
        char c1 = ' ', c2 = ' ';
        int ret = 0, cur = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c1 == ' ') {
                c1 = c;
                cur = 1;
            } else if (c1 == c) {
                //
            } else if (c2 == ' ') {
                c2 = c;
                cur = 2;
            } else if (c2 == c) {
                //
            } else {
                break;
            }

            if (cur == 1 && (i + 1) % 3 == cur) {
                ret++;
            }
            if (cur == 2 && (i + 1) % 3 == cur) {
                ret++;
            }
        }

        return ret;
    }
}
