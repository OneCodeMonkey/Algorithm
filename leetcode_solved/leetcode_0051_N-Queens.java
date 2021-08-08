// AC: Runtime: 5 ms, faster than 49.79% of Java online submissions for N-Queens.
// Memory Usage: 39.6 MB, less than 47.44% of Java online submissions for N-Queens.
// backtracking
// T:O(n^3), S:O(n^2)
// 
lass Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<Integer>> record = new LinkedList<>();
        int[][] chessboard = new int[n][n];
        backtracking(chessboard, new LinkedList<>(), record, 0);

        List<List<String>> ret = new LinkedList<>();
        for (List<Integer> item: record) {
            List<String> tempList = new LinkedList<>();

            for (int index: item) {
                StringBuilder rowStr = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if (i == index) {
                        rowStr.append("Q");
                    } else {
                        rowStr.append(".");
                    }
                }
                tempList.add(rowStr.toString());
            }
            ret.add(tempList);
        }

        return ret;
    }

    private void backtracking(int[][] chessboard, List<Integer> path, List<List<Integer>> out, int startIndex) {
        int size = chessboard.length;
        List<Integer> pathCopy = new LinkedList<>(path);
        if (pathCopy.size() == size) {
            out.add(pathCopy);
            return;
        }

        for (int i = 0; i < size; i++) {
            if (checkChessboard(chessboard, startIndex, i)) {
                pathCopy.add(i);
                chessboard[startIndex][i] = 1;
                backtracking(chessboard, pathCopy, out, startIndex + 1);
                pathCopy.remove(pathCopy.size() - 1);
                chessboard[startIndex][i] = 0;
            }
        }
    }

    private boolean checkChessboard(int[][] chessboard, int row, int col) {
        int size = chessboard.length;
        // check column
        for (int i = 0; i < size; i++) {
            if (i == row) {
                continue;
            }
            if (chessboard[i][col] == 1) {
                return false;
            }
        }

        // check 45° diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < size; i--, j++) {
            if (chessboard[i][j] == 1) {
                return false;
            }
        }
        for (int i = row + 1, j = col - 1; i < size && j >= 0; i++, j--) {
            if (chessboard[i][j] == 1) {
                return false;
            }
        }

        // check 135° diagonal
        for (int i = row + 1, j = col + 1; i < size && j < size; i++, j++) {
            if (chessboard[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}