// AC: Runtime 0 ms Beats 100%
// Memory 40 MB Beats 62.41%
// search.
// T:O(4 * 8 * 8), S:O(1)
// 
class Solution {
    public int numRookCaptures(char[][] board) {
        int ret = 0, rookX = -1, rookY = -1, x = 0, y = 0;
        char rook = 'R', bishop = 'B', pawn = 'p', emptySpace = '.';
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == rook) {
                    rookX = i;
                    rookY = j;
                }
            }
        }
        x = rookX;
        y = rookY;
        while (x + 1 < 8) {
            if (board[x + 1][y] == bishop) {
                break;
            }
            if (board[x + 1][y] == pawn) {
                ret++;
                break;
            }
            x++;
        }
        x = rookX;
        y = rookY;
        while (x - 1 >= 0) {
            if (board[x - 1][y] == bishop) {
                break;
            }
            if (board[x - 1][y] == pawn) {
                ret++;
                break;
            }
            x--;
        }
        x = rookX;
        y = rookY;
        while (y + 1 < 8) {
            if (board[x][y + 1] == bishop) {
                break;
            }
            if (board[x][y + 1] == pawn) {
                ret++;
                break;
            }
            y++;
        }
        x = rookX;
        y = rookY;
        while (y - 1 >= 0) {
            if (board[x][y - 1] == bishop) {
                break;
            }
            if (board[x][y - 1] == pawn) {
                ret++;
                break;
            }
            y--;
        }

        return ret;
    }
}
