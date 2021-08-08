// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Check if Move is Legal.
// Memory Usage: 39.8 MB, less than 100.00% of Java online submissions for Check if Move is Legal.
// check x-axios, y-axios, 45° diagonal, 135° diagonal
// T:O(4 * n) ~ O(n), S:O(1)
// 
class Solution {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        char oppositeColor = ' ';
        if (color == 'B') {
            oppositeColor = 'W';
        } else {
            oppositeColor = 'B';
        }

        // y-axios
        if (rMove >= 2) {
            if (board[rMove - 1][cMove] == oppositeColor) {
                for (int i = rMove - 2; i >= 0; i--) {
                    if (board[i][cMove] == '.') {
                        break;
                    }
                    if (board[i][cMove] == color) {
                        return true;
                    }
                }
            }
        }
        if (rMove <= 5) {
            if (board[rMove + 1][cMove] == oppositeColor) {
                for (int i = rMove + 2; i <= 7; i++) {
                    if (board[i][cMove] == '.') {
                        break;
                    }
                    if (board[i][cMove] == color) {
                        return true;
                    }
                }
            }
        }

        // x-axios
        if (cMove >= 2) {
            if (board[rMove][cMove - 1] == oppositeColor) {
                for (int i = cMove - 2; i >= 0; i--) {
                    if (board[rMove][i] == '.') {
                        break;
                    }
                    if (board[rMove][i] == color) {
                        return true;
                    }
                }
            }
        }
        if (cMove <= 5) {
            if (board[rMove][cMove + 1] == oppositeColor) {
                for (int i = cMove + 2; i <= 7; i++) {
                    if (board[rMove][i] == '.') {
                        break;
                    }
                    if (board[rMove][i] == color) {
                        return true;
                    }
                }
            }
        }

        // 45°
        if (rMove >= 2 && cMove <= 5) {
            if (board[rMove - 1][cMove + 1] == oppositeColor) {
                for (int i = 2; rMove - i >= 0 && cMove + i <= 7; i++) {
                    if (board[rMove - i][cMove + i] == '.') {
                        break;
                    }
                    if (board[rMove - i][cMove + i] == color) {
                        return true;
                    }
                }
            }
        }
        if (rMove <= 5 && cMove >= 2) {
            if (board[rMove + 1][cMove - 1] == oppositeColor) {
                for (int i = 2; rMove + i <= 7 && cMove - i >= 0; i++) {
                    if (board[rMove + i][cMove - i] == '.') {
                        break;
                    }
                    if (board[rMove + i][cMove - i] == color) {
                        return true;
                    }
                }
            }
        }

        // 135°
        if (rMove >= 2 && cMove >= 2) {
            if (board[rMove - 1][cMove - 1] == oppositeColor) {
                for (int i = 2; rMove - i >= 0 && cMove - i >= 0; i++) {
                    if (board[rMove - i][cMove - i] == '.') {
                        break;
                    }
                    if (board[rMove - i][cMove - i] == color) {
                        return true;
                    }
                }
            }
        }
        if (rMove <= 5 && cMove <= 5) {
            if (board[rMove + 1][cMove + 1] == oppositeColor) {
                for (int i = 2; rMove + i <= 7 && cMove + i <= 7; i++) {
                    if (board[rMove + i][cMove + i] == '.') {
                        break;
                    }
                    if (board[rMove + i][cMove + i] == color) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}