// AC: Runtime: 1 ms, faster than 80.00% of Java online submissions for Minimum Recolors to Get K Consecutive Black Blocks.
// Memory Usage: 41.8 MB, less than 40.00% of Java online submissions for Minimum Recolors to Get K Consecutive Black Blocks.
// thought: find the sequence with length K and lease number of char 'W'.
// T:O(n), S:O(1)
// 
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int countWhite = 0, ret;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                countWhite++;
            }
        }
        if (countWhite == 0) {
            return 0;
        }
        ret = countWhite;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                countWhite--;
            }
            if (blocks.charAt(i) == 'W') {
                countWhite++;
            }
            ret = Math.min(ret, countWhite);
        }

        return ret;
    }
}