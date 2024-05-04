// Runtime 0 ms Beats 100.00% of users with Java
// Memory 41.81 MB Beats 50.00% of users with Java
// Brute-force.
// T:O(m * n * k^2), S:O(1)
// 
class Solution {
    public boolean canMakeSquare(char[][] grid) {
        final char black = 'B', white = 'W';
        int row = grid.length, col = grid[0].length;
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                int countB = 0, countW = 0;
                for (int r = i; r <= i + 1; r++) {
                    for (int t = j; t <= j + 1; t++) {
                        if (grid[r][t] == black) {
                            countB++;
                        } else {
                            countW++;
                        }
                        if (countB == 3 || countW == 3) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
