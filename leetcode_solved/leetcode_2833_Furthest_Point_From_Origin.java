// AC: Runtime 1 ms Beats 100%
// Memory 41.4 MB Beats 50%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int len = moves.length(), countL = 0, countR = 0;
        for (int i = 0; i < len; i++) {
            char c = moves.charAt(i);
            if (c == 'L') {
                countL++;
            } else if (c == 'R') {
                countR++;
            }
        }

        return len - 2 * Math.min(countL, countR);
    }
}
