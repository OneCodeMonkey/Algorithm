// Runtime 1 ms Beats 100.00%
// Memory 44.96 MB Beats 100.00%
// .
// T:O(m * n), S:O(1)
// 
class Solution {
    public int minimumOperations(int[][] grid) {
        int ret = 0, row = grid.length, col = grid[0].length;
        for (int i = 0; i < col; i++) {
            int prev = grid[0][i];
            for (int j = 1; j < row; j++) {
                if (grid[j][i] <= prev) {
                    ret += prev + 1 - grid[j][i];
                    prev++;
                } else {
                    prev = grid[j][i];
                }
            }
        }

        return ret;
    }
}
