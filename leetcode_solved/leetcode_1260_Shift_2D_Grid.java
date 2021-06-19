// AC: Runtime: 6 ms, faster than 62.36% of Java online submissions for Shift 2D Grid.
// Memory Usage: 40 MB, less than 47.11% of Java online submissions for Shift 2D Grid.
// cursor mapping from old to new.
// T:O(n), S:O(1)
//
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        int row = grid.length, col = grid[0].length, total = row * col;
        for (int i = 0; i < row; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                rowList.add(0);
            }
            ret.add(rowList);
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int pos = (i * col + j + 1) + k;
                pos = pos % total == 0 ? total : pos % total;
                int newRow = (pos % col == 0) ? (pos / col - 1) : (pos / col), newCol = (pos % col == 0) ? (col - 1) : (pos % col - 1);
                ret.get(newRow).set(newCol, grid[i][j]);
            }
        }

        return ret;
    }
}