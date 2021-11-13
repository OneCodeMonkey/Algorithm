// AC: Runtime: 30 ms, faster than 80.82% of Java online submissions for Flip Columns For Maximum Number of Equal Rows.
// Memory Usage: 48.8 MB, less than 91.78% of Java online submissions for Flip Columns For Maximum Number of Equal Rows.
// find the maximum same row or totally opposite row.
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int ret = 0;
        HashMap<String, Integer> record = new HashMap<>();
        for (int[] row: matrix) {
            StringBuilder temp1 = new StringBuilder(), temp2 = new StringBuilder();
            for (int i: row) {
                if (i == 0) {
                    temp1.append('0');
                    temp2.append('1');
                } else {
                    temp1.append('1');
                    temp2.append('0');
                }
            }
            record.merge(temp1.toString(), 1, Integer::sum);
            record.merge(temp2.toString(), 1, Integer::sum);
        }
        for (String str: record.keySet()) {
            ret = Math.max(record.get(str), ret);
        }

        return ret;
    }
}