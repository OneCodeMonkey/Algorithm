// AC: Runtime: 1 ms, faster than 17.45% of Java online submissions for Find Winner on a Tic Tac Toe Game.
// Memory Usage: 38.5 MB, less than 9.01% of Java online submissions for Find Winner on a Tic Tac Toe Game.
// .
// T:O(moves.length * (grid.length)^2), S:O((grid.length)^2)
//
class Solution {
    public String tictactoe(int[][] moves) {
        int[][] grid = new int[3][3];
        int i;
        for (i = 0; i < moves.length; i++) {
            int place = (i % 2 == 0 ? 1 : -1);
            grid[moves[i][0]][moves[i][1]] = place;
            if (check(grid)) {
                return i % 2 == 0 ? "A" : "B";
            }
        }
        return i == 9 ? "Draw" : "Pending";
    }

    private boolean check(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        for (int i = 0; i < row; i++) {
            boolean flag = true;
            for (int j = 0; j < col - 1; j++) {
                if (grid[i][j] == 0 || grid[i][j] != grid[i][j + 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        for (int i = 0; i < col; i++) {
            boolean flag = true;
            for (int j = 0; j < row - 1; j++) {
                if (grid[j][i] == 0 || grid[j][i] != grid[j + 1][i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        boolean flag = true;
        for (int i = 0; i < row - 1; i++) {
            if (grid[i][i] == 0 || grid[i][i] != grid[i + 1][i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return true;
        }

        flag = true;
        for (int i = 0; i < row - 1; i++) {
            if (grid[row - 1 - i][i] == 0 || grid[row - 1 - i][i] != grid[row - 2 - i][i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return true;
        }

        return false;
    }
}