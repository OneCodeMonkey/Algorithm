// Time: Runtime 9 ms Beats 67.85%
// Memory 49.6 MB Beats 32.46%
// Record the last matching character position of `t`, and compare.
// T:O(s.length()), S:O(1)
// 
class Solution {
    public int appendCharacters(String s, String t) {
        int tPos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (tPos < t.length() && s.charAt(i) == t.charAt(tPos)) {
                tPos++;
                if (tPos >= t.length()) {
                    return 0;
                }
            }
        }

        return t.length() - tPos;
    }
}
