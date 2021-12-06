// AC: Runtime: 1 ms, faster than 85.71% of Java online submissions for Queens That Can Attack the King.
// Memory Usage: 39.1 MB, less than 79.93% of Java online submissions for Queens That Can Attack the King.
// .
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] board = new int[8][8];
        for (int[] queen : queens) {
            board[queen[0]][queen[1]] = 1;
        }
        List<List<Integer>> ret = new LinkedList();
        int row = queens.length, col = queens[0].length, curX = king[0], curY = king[1];
        for (int i = 0; curX + i < 8; i++) {
            if (board[curX + i][curY] == 1) {
                List<Integer> tempList = new LinkedList();
                tempList.add(curX + i);
                tempList.add(curY);
                ret.add(tempList);
                break;
            }
        }
        for (int i = 0; curX - i >= 0; i++) {
            if (board[curX - i][curY] == 1) {
                List<Integer> tempList = new LinkedList();
                tempList.add(curX - i);
                tempList.add(curY);
                ret.add(tempList);
                break;
            }
        }
        for (int i = 0; curY + i < 8; i++) {
            if (board[curX][curY + i] == 1) {
                List<Integer> tempList = new LinkedList();
                tempList.add(curX);
                tempList.add(curY + i);
                ret.add(tempList);
                break;
            }
        }
        for (int i = 0; curY - i >= 0; i++) {
            if (board[curX][curY - i] == 1) {
                List<Integer> tempList = new LinkedList();
                tempList.add(curX);
                tempList.add(curY - i);
                ret.add(tempList);
                break;
            }
        }
        for (int i = 0; curX + i < 8 && curY + i < 8; i++) {
            if (board[curX + i][curY + i] == 1) {
                List<Integer> tempList = new LinkedList();
                tempList.add(curX + i);
                tempList.add(curY + i);
                ret.add(tempList);
                break;
            }
        }
        for (int i = 0; curX - i >= 0 && curY - i >= 0; i++) {
            if (board[curX - i][curY - i] == 1) {
                List<Integer> tempList = new LinkedList();
                tempList.add(curX - i);
                tempList.add(curY - i);
                ret.add(tempList);
                break;
            }
        }
        for (int i = 0; curX + i < 8 && curY - i >= 0; i++) {
            if (board[curX + i][curY - i] == 1) {
                List<Integer> tempList = new LinkedList();
                tempList.add(curX + i);
                tempList.add(curY - i);
                ret.add(tempList);
                break;
            }
        }
        for (int i = 0; curX - i >= 0 && curY + i < 8; i++) {
            if (board[curX - i][curY + i] == 1) {
                List<Integer> tempList = new LinkedList();
                tempList.add(curX - i);
                tempList.add(curY + i);
                ret.add(tempList);
                break;
            }
        }

        return ret;
    }
}