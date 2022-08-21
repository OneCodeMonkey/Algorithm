// AC: Runtime: 4 ms, faster than 55.19% of Java online submissions for Largest Local Values in a Matrix.
// Memory Usage: 51.8 MB, less than 72.56% of Java online submissions for Largest Local Values in a Matrix.
// brute-force
// T:O(n^2), S:O(1)
// 
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int size = grid.length;
        int[][] ret = new int[size - 2][size - 2];
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                int maxVal = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int v = j - 1; v <= j + 1; v++) {
                        maxVal = Math.max(maxVal, grid[k][v]);
                    }
                }
                ret[i - 1][j - 1] = maxVal;
            }
        }

        return ret;
    }
}
