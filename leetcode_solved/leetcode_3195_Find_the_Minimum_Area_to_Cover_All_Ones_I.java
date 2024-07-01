// Runtime 5 ms Beats 100.00%
// Memory 196.46 MB Beats 100.00%
// Geometry.
// T:O(m * n), S:O(1)
// 
class Solution {
    public int minimumArea(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int minX = col + 1, maxX = 0, minY = row, maxY = 0, ret = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    minX = Math.min(minX, j);
                    maxX = Math.max(maxX, j);
                    minY = Math.min(minY, i);
                    maxY = Math.max(maxY, i);
                }
            }
        }
        if (minX <= col) {
            ret = (maxX - minX + 1) * (maxY - minY + 1);
        }

        return ret;
    }
}

