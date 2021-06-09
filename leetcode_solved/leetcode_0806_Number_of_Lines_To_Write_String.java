// AC: Runtime: 1 ms, faster than 13.95% of Java online submissions for Number of Lines To Write String.
// Memory Usage: 37.4 MB, less than 31.98% of Java online submissions for Number of Lines To Write String.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] ret = new int[2];
        int line = 1, lastLineWidth = 0, tempLineWidth = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < widths.length; i++) {
            record.put(i, widths[i]);
        }
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            int width = record.get(c);
            if (tempLineWidth + width > 100) {
                line++;
                lastLineWidth = width;
                tempLineWidth = width;
            } else {
                lastLineWidth += width;
                tempLineWidth += width;
            }
        }

        ret[0] = line;
        ret[1] = lastLineWidth;
        return ret;
    }
}