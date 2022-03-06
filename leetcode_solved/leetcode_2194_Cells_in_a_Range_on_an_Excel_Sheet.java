// AC: Runtime: 13 ms, faster than 40.00% of Java online submissions for Cells in a Range on an Excel Sheet.
// Memory Usage: 47.6 MB, less than 40.00% of Java online submissions for Cells in a Range on an Excel Sheet.
// .
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ret = new LinkedList<>();
        char startCol = s.charAt(0), endCol = s.charAt(3);
        int startRow = Integer.parseInt(String.valueOf(s.charAt(1))), endRow = Integer.parseInt(String.valueOf(s.charAt(4)));

        for (char c = startCol; c <= endCol; c++) {
            for (int r = startRow; r <= endRow; r++) {
                ret.add(c + String.valueOf(r));
            }
        }

        return ret;
    }
}