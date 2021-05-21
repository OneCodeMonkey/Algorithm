// AC: Runtime: 1 ms, faster than 77.16% of Java online submissions for Is Subsequence.
// Memory Usage: 36.7 MB, less than 78.18% of Java online submissions for Is Subsequence.
// two-pointer going through,
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) {
            return false;
        }
        int pos1 = 0, pos2 = 0;
        while (pos1 < s.length()) {
            if (t.charAt(pos2) == s.charAt(pos1)) {
                pos1++;
                pos2++;
                // 提前走完
                if (pos2 >= t.length() && pos1 < s.length()) {
                    return false;
                }
            } else {
                while (t.charAt(pos2) != s.charAt(pos1)) {
                    pos2++;
                    if (pos2 >= t.length()) {
                        return false;
                    }
                }
                if ((pos2 == t.length() - 1 && pos1 != s.length() - 1)) {
                    return false;
                }
                pos1++;
                pos2++;
            }
        }

        return true;
    }
}