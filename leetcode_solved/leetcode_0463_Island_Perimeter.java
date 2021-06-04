// AC: Runtime: 6 ms, faster than 55.36% of Java online submissions for Island Perimeter.
// Memory Usage: 40.2 MB, less than 56.24% of Java online submissions for Island Perimeter.
// Thoughts: For every cell, we can judge the up/down/left/right 4-directions, and judge its contribution to perimeter
// T:O(m * n), S:O(1)
// 
class Solution {
    public int islandPerimeter(int[][] grid) {
        int ret = 0, row = grid.length, col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    ret += count(grid, i, j);
                }
            }
        }
        return ret;
    }
    
    private int count(int[][] grid, int i, int j) {
        int ret = 4;
        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
            ret--;
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
            ret--;
        }
        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            ret--;
        }
        if (i + 1 < grid.length && grid[i + 1][j] == 1) {
            ret--;
        }
        return ret;
    }
}