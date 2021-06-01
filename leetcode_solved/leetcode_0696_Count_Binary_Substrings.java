// AC: Runtime: 8 ms, faster than 82.81% of Java online submissions for Count Binary Substrings.
// Memory Usage: 39.4 MB, less than 59.85% of Java online submissions for Count Binary Substrings.
// 。
// T:O(n), S:O(1)
//
class Solution {
    public int countBinarySubstrings(String s) {
        int pre = 0, cur = 0, ret = 0;
        for (int i = 0; i < s.length(); i++) {
            if (cur == 0) {
                cur++;
            } else {
                if (s.charAt(i - 1) != s.charAt(i)) {
                    if (pre != 0) {
                        ret += Math.min(pre, cur);
                    }
                    pre = cur;
                    cur = 1;
                } else {
                    cur++;
                }
            }
        }
        ret += Math.min(pre, cur);
        return ret;
    }
}