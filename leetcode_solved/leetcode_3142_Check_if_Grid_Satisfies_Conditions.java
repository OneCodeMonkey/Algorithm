// Runtime 0 ms Beats 100.00% of users with Java
// Memory 44.08 MB Beats 100.00% of users with Java
// .
// T:O(m * n), S:O(1)
// 
class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int row = grid.length, col = grid[0].length, prev = -1;
        for (int i = 0; i < col; i++) {
            if (prev != -1) {
                if (grid[0][i] == prev) {
                    return false;
                }
            }
            prev = grid[0][i];
        }

        for (int i = 0; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (grid[j][i] != grid[0][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
