// AC: Runtime: 71 ms, faster than 95.74% of Java online submissions for Word Search.
// Memory Usage: 37.4 MB, less than 50.74% of Java online submissions for Word Search.
// dfs. there is a trick to mark visited position, that is `board[x][y] ^= 1 << 8;` this will mark as a char but not in [a, z].
// T:O(m * n * 4 * len(word)), S:O(1)
// 
class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordArr = word.toCharArray();
        int row = board.length, col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (check(board, i, j, wordArr, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean check(char[][] board, int x, int y, char[] word, int offset) {
        if (offset == word.length) {
            return true;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] != word[offset]) {
            return false;
        }
        board[x][y] ^= 1 << 8;
        boolean check = check(board, x, y + 1, word, offset + 1) ||
                check(board, x, y - 1, word, offset + 1) ||
                check(board, x + 1, y, word, offset + 1) ||
                check(board, x - 1, y, word, offset + 1);
        board[x][y] ^= 1 << 8;

        return check;
    }
}