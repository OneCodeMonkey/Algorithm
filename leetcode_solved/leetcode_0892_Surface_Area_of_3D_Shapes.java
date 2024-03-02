// Runtime 6 ms Beats 42.58% of users with Java
// Memory 44.26 MB Beats 43.54% of users with Java
// Judge from 6 surfaces with each cell, sum up the surface area.
// T:O(n ^ 2), S:O(1)
// 
class Solution {
    public int surfaceArea(int[][] grid) {
        int len = grid.length, ret = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                // top,bottom
                if (grid[i][j] > 0) {
                    ret += 2;
                }
                // up
                if (i == 0) {
                    ret += grid[i][j];
                } else {
                    if (grid[i - 1][j] < grid[i][j]) {
                        ret += grid[i][j] - grid[i - 1][j];
                    }
                }
                // bottom
                if (i == len - 1) {
                    ret += grid[i][j];
                } else {
                    if (grid[i + 1][j] < grid[i][j]) {
                        ret += grid[i][j] - grid[i + 1][j];
                    }
                }
                // left
                if (j == 0) {
                    ret += grid[i][j];
                } else {
                    if (grid[i][j - 1] < grid[i][j]) {
                        ret += grid[i][j] - grid[i][j - 1];
                    }
                }
                // right
                if (j == len - 1) {
                    ret += grid[i][j];
                } else {
                    if (grid[i][j + 1] < grid[i][j]) {
                        ret += grid[i][j] - grid[i][j + 1];
                    }
                }
            }
        }

        return ret;
    }
}
