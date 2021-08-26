// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Time to Type Word Using Special Typewriter.
// Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Minimum Time to Type Word Using Special Typewriter.
// .
// T:O(n), S:(1)
//
class Solution {
    public int minTimeToType(String word) {
        int ret = 0, curPos = 0, size = word.length();
        for (int i = 0; i < size; i++) {
            int c = word.charAt(i) - 'a';
            int move = Math.abs(c - curPos);
            int minMove = Math.min(move, 26 - move);
            ret += minMove + 1;
            curPos = c;
        }

        return ret;
    }
}
