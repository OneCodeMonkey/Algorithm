// Runtime 7 ms Beats 100.00%
// Memory 111.18 MB Beats 100.00%
// .
// T:O(m * n), S:O(1)
// 
class Solution {
    public int minFlips(int[][] grid) {
        int row = grid.length, col = grid[0].length, notPalindromeInRow = 0, notPalindromeInCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2; j++) {
                if (grid[i][col - 1 - j] != grid[i][j]) {
                    notPalindromeInRow++;
                }
            }
        }
        if (notPalindromeInRow == 0) {
            return 0;
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row / 2; j++) {
                if (grid[row - 1 - j][i] != grid[j][i]) {
                    notPalindromeInCol++;
                }
            }
        }

        return Math.min(notPalindromeInRow, notPalindromeInCol);
    }
}
