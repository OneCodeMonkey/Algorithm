// AC: Runtime: 1 ms, faster than 71.06% of Java online submissions for Battleships in a Board.
// Memory Usage: 43.8 MB, less than 6.98% of Java online submissions for Battleships in a Board.
// battleship occurs when adjacent cell is not battle. So count cell where its upper or left element is not X.
// T:O(m * n), S:O(1)
//
class Solution {
    public int countBattleships(char[][] board) {
        int row = board.length, col = board[0].length, ret = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] != '.') {
                    if ((i == 0 || board[i - 1][j] == '.')
                            && (j == 0 || board[i][j - 1] == '.')) {
                        ret++;
                    }
                }
            }
        }

        return ret;
    }
}