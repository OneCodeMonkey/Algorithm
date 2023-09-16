// AC: Runtime 7 ms Beats 99.76%
// Memory 44.1 MB Beats 82.46%
// String operation.
// T:O(n), S:O(1)
// 
class Solution {
    public int longestContinuousSubstring(String s) {
        int ret = 1, cur = 1;
        char prev = ' ';
        for (char c : s.toCharArray()) {
            if (prev != ' ') {
                if (c - prev == 1) {
                    cur++;
                    ret = Math.max(ret, cur);
                } else {
                    cur = 1;
                }
            }
            prev = c;
        }

        return ret;
    }
}
