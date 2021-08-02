// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Count Servers that Communicate.
// Memory Usage: 46 MB, less than 46.96% of Java online submissions for Count Servers that Communicate.
// record the sum of rows and cols, if sum > 1, then the whole row or column is to be added.
// T:O(m * n), S:O(max(m, n))
// 
class Solution {
    public int countServers(int[][] grid) {
        int ret = 0, row = grid.length, col = grid[0].length;
        int[] rowSum = new int[row], colSum = new int[col];
        // record the first one's index on a row, if not, -1.
        int[] rowFirstOneIndex = new int[row];
        for (int i = 0; i < row; i++) {
            rowFirstOneIndex[i] = -1;
        }

        for (int i = 0; i < row; i++) {
            int temp = 0;
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    temp += grid[i][j];
                    rowFirstOneIndex[i] = j;
                }
            }
            rowSum[i] = temp;
        }

        for (int j = 0; j < col; j++) {
            int temp = 0;
            for (int i = 0; i < row; i++) {
                temp += grid[i][j];
            }
            colSum[j] = temp;
        }

        for (int i = 0; i < row; i++) {
            if (rowSum[i] > 1) {
                ret += rowSum[i];
            } else {
                // the row's single one have more than one element on its column.
                if (rowFirstOneIndex[i] != -1 && colSum[rowFirstOneIndex[i]] > 1) {
                    ret += 1;
                }
            }
        }

        return ret;
    }
}