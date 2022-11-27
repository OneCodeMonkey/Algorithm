// Time: Runtime 14 ms Beats 100%
// Memory 81 MB Beats 100%
// Do as the problem says.
// T:O(m*n), S:O(m*n)
// 
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[] rowOnes = new int[row], rowZeros = new int[row];
        int[] colOnes = new int[col], colZeros = new int[col];
        for (int i = 0; i < row; i++) {
            int countOne = 0, countZero = 0;
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    countOne++;
                } else {
                    countZero++;
                }
            }
            rowOnes[i] = countOne;
            rowZeros[i] = countZero;
        }
        for (int i = 0; i < col; i++) {
            int countOne = 0, countZero = 0;
            for (int[] ints : grid) {
                if (ints[i] == 1) {
                    countOne++;
                } else {
                    countZero++;
                }
            }
            colOnes[i] = countOne;
            colZeros[i] = countZero;
        }
        int[][] diff = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                diff[i][j] = rowOnes[i] + colOnes[j] - rowZeros[i] - colZeros[j];
            }
        }

        return diff;
    }
}
