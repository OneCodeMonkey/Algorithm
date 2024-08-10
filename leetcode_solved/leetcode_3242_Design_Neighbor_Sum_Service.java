// Runtime 17 ms Beats 50.00%
// Memory 45.78 MB Beats 50.00%
// Hashmap.
// T:O(n), S:O(n)
// 
class neighborSum {
    private HashMap<Integer, Integer> sumAdjacent, sumDiagonal;

    public neighborSum(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        sumAdjacent = new HashMap<>(row * col);
        sumDiagonal = new HashMap<>(row * col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int adjacentSum1 = 0, diagonalSum1 = 0;
                if (i - 1 >= 0) {
                    adjacentSum1 += grid[i - 1][j];
                    if (j - 1 >= 0) {
                        diagonalSum1 += grid[i - 1][j - 1];
                    }
                    if (j + 1 < col) {
                        diagonalSum1 += grid[i - 1][j + 1];
                    }
                }
                if (i + 1 < row) {
                    adjacentSum1 += grid[i + 1][j];
                    if (j - 1 >= 0) {
                        diagonalSum1 += grid[i + 1][j - 1];
                    }
                    if (j + 1 < col) {
                        diagonalSum1 += grid[i + 1][j + 1];
                    }
                }
                if (j - 1 >= 0) {
                    adjacentSum1 += grid[i][j - 1];
                }
                if (j + 1 < col) {
                    adjacentSum1 += grid[i][j + 1];
                }
                sumAdjacent.put(grid[i][j], adjacentSum1);
                sumDiagonal.put(grid[i][j], diagonalSum1);
            }
        }
    }

    public int adjacentSum(int value) {
        return sumAdjacent.get(value);
    }

    public int diagonalSum(int value) {
        return sumDiagonal.get(value);
    }
}
