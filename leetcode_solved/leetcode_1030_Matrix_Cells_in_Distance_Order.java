// AC: Runtime: 12 ms, faster than 48.37% of Java online submissions for Matrix Cells in Distance Order.
// Memory Usage: 41.2 MB, less than 40.43% of Java online submissions for Matrix Cells in Distance Order.
// using multi-sort
// T:O((rows*cols)*log(rows*cols)), S:O(log(rows*cols))
// 
class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] record = new int[rows * cols][2];
        int pos = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                record[pos++] = new int[]{i, j};
            }
        }
        Arrays.sort(record, (a, b) -> ((Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter)) - (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter))));

        return record;
    }
}