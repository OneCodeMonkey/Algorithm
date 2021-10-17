// AC: Runtime: 1 ms, faster than 80.00% of Java online submissions for Minimum Moves to Convert String.
// Memory Usage: 38.7 MB, less than 40.00% of Java online submissions for Minimum Moves to Convert String.
// straight forward
// T:O(n), S:O(1)
//
class Solution {
    public int minimumMoves(String s) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                ret++;
                i += 2;
            }
        }

        return ret;
    }
}