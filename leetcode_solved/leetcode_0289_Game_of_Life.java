// AC: Runtime: 1 ms, faster than 23.27% of Java online submissions for Game of Life.
// Memory Usage: 38.9 MB, less than 8.21% of Java online submissions for Game of Life.
// .
// T:O(9 * n) ~ O(n), S:O(1)
//
class Solution {
    public void gameOfLife(int[][] board) {
        int row = board.length, col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int countOne = 0;
                for (int t = Math.max(0, i - 1); t <= Math.min(row - 1, i + 1); t++) {
                    for (int k = Math.max(0, j - 1); k <= Math.min(col - 1, j + 1); k++) {
                        if (t == i && k == j) {
                            continue;
                        }
                        if (board[t][k] == 1 || board[t][k] == -1) {
                            countOne++;
                        }
                    }
                }
                if (board[i][j] == 1) {
                    if (countOne < 2) {
                        // live cell will dead
                        board[i][j] = -1;
                    } else if (countOne == 2 || countOne == 3) {
                        // live
                    } else {
                        // over-population, die
                        board[i][j] = -1;
                    }
                } else {
                    if (countOne == 3) {
                        // dead cell will birth
                        board[i][j] = -2;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                }
                if (board[i][j] == -2) {
                    board[i][j] = 1;
                }
            }
        }
    }
}