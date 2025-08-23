// Runtime 1 ms Beats 58.11% 
// Memory 45.78 MB Beats 53.63%
// .
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int row = grid.length, col = grid[0].length, x1 = x + k - 1, y1 = y + k - 1;
        int[][] ret = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i >= x && i <= x1 && j >= y && j <= y1) {
                    ret[i][j] = grid[2 * x + k - i - 1][j];
                } else {
                    ret[i][j] = grid[i][j];
                }
            }
        }

        return ret;
    }
}
