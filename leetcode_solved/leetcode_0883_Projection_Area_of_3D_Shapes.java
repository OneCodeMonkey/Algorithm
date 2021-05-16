// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Projection Area of 3D Shapes.
// Memory Usage: 38.6 MB, less than 53.88% of Java online submissions for Projection Area of 3D Shapes.
// 略.
// T:O(row * col), S:O(1)
// 
class Solution {
    public int projectionArea(int[][] grid) {
        int ret = 0, size = grid.length;
        // top-view
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] > 0) {
                    ret++;
                }
            }
        }
        // x-axis view
        for (int i = 0; i < size; i++) {
            int tempMax = 0;
            for (int j = 0; j < size; j++) {
                if (grid[i][j] > tempMax) {
                    tempMax = grid[i][j];
                }
            }
            ret += tempMax;
        }
        // y-axis view
        for (int i = 0; i < size; i++) {
            int tempMax = 0;
            for (int j = 0; j < size; j++) {
                if (grid[j][i] > tempMax) {
                    tempMax = grid[j][i];
                }
            }
            ret += tempMax;
        }

        return ret;
    }
}
