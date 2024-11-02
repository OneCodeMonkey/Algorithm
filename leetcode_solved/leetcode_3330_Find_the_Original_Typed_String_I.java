// Runtime 1 ms Beats 100.00% 
// Memory 41.92 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int possibleStringCount(String word) {
        int ret = 1, cur = 0;
        char prev = ' ';
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (i == 0) {
                prev = c;
                continue;
            }
            if (c == prev) {
                cur++;
                if (i == word.length() - 1) {
                    ret += cur;
                }
            } else {
                ret += cur;
                cur = 0;
            }
            prev = c;
        }

        return ret;
    }
}
