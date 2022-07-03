// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Check if Matrix Is X-Matrix.
// Memory Usage: 42.9 MB, less than 100.00% of Java online submissions for Check if Matrix Is X-Matrix.
// .
// T:O(n^2), S:O(1)
// 
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int row = grid.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j || i + j == row - 1) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}