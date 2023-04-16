// AC: Runtime 4 ms Beats 100% 
// Memory 43.5 MB Beats 100%
// .
// T:O(m * n), S:O(n)
// 
class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[] ret = new int[col];
        for (int i = 0; i < col; i++) {
            int width = 0;
            for (int[] ints : grid) {
                int num = ints[i], curWidth = 0;
                if (num == 0) {
                    curWidth = 1;
                } else {
                    if (num < 0) {
                        curWidth++;
                        num = -num;
                    }
                    while (num > 0) {
                        num /= 10;
                        curWidth++;
                    }
                }
                width = Math.max(width, curWidth);
            }
            ret[i] = width;
        }

        return ret;
    }
}