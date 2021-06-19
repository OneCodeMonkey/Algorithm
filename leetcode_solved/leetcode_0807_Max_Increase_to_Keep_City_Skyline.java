// AC: Runtime: 1 ms, faster than 99.07% of Java online submissions for Max Increase to Keep City Skyline.
// Memory Usage: 39 MB, less than 25.81% of Java online submissions for Max Increase to Keep City Skyline.
// .
// T:O(n^2), S:O(n)
//
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int ret = 0, size = grid.length;
        int[] rowMaxList = new int[size], colMaxList = new int[size];
        for (int i = 0; i < size; i++) {
            int rowMax = 0;
            for (int j = 0; j < size; j++) {
                rowMax = Math.max(rowMax, grid[i][j]);
            }
            rowMaxList[i] = rowMax;
        }
        for (int i = 0; i < size; i++) {
            int colMax = 0;
            for (int j = 0; j < size; j++) {
                colMax = Math.max(colMax, grid[j][i]);
            }
            colMaxList[i] = colMax;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ret += Math.min(rowMaxList[i], colMaxList[j]) - grid[i][j];
            }
        }
        
        return ret;
    }
}