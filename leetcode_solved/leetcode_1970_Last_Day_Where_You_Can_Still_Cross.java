// AC: Runtime: 81 ms, faster than 33.33% of Java online submissions for Last Day Where You Can Still Cross.
// Memory Usage: 48 MB, less than 100.00% of Java online submissions for Last Day Where You Can Still Cross.
// binary search & bfs search of graph
// T:(nlogn), S:O(n), n = row * col
//
class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int left = 0, right = row * col - 1, ret = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(cells, row, col, mid)) {
                ret = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ret;
    }

    private boolean check(int[][] cells, int row, int col, int day) {
        int[][] grid = new int[row][col];
        for (int i = 0; i < day; i++) {
            grid[cells[i][0] - 1][cells[i][1] - 1] = 1;
        }
        Queue<int[]> bfs = new ArrayDeque<>();
        for (int i = 0; i < col; i++) {
            if (grid[0][i] == 0) {
                bfs.offer(new int[]{0, i});
                grid[0][i] = 1;
            }
        }
        int[] dir = new int[]{0, 1, 0, -1, 0};
        while (!bfs.isEmpty()) {
            int[] curPoint = bfs.poll();
            int curRow = curPoint[0], curCol = curPoint[1];
            if (curRow == row - 1) {
                return true;
            }
            for (int i = 0; i < 4; i++) {
                int tempRow = curRow + dir[i], tempCol = curCol + dir[i + 1];
                if (tempRow < 0 || tempRow >= row || tempCol < 0 || tempCol >= col || grid[tempRow][tempCol] == 1) {
                    continue;
                }
                grid[tempRow][tempCol] = 1;
                bfs.offer(new int[]{tempRow, tempCol});
            }
        }

        return false;
    }
}