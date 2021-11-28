// AC: Runtime: 28 ms, faster than 95.31% of Java online submissions for Minimum Operations to Make a Uni-Value Grid.
// Memory Usage: 68.7 MB, less than 82.95% of Java online submissions for Minimum Operations to Make a Uni-Value Grid.
// .
// T:O(m * n), S:O(m * n)
//
class Solution {
    public int minOperations(int[][] grid, int x) {
        int firstElement = grid[0][0], row = grid.length, col = grid[0].length, pos = 0;
        int[] elements = new int[row * col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (Math.abs(grid[i][j] - firstElement) % x != 0) {
                    return -1;
                }
                elements[pos++] = grid[i][j];
            }
        }
        Arrays.sort(elements);
        int base = elements[(row * col) / 2], ret = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ret += Math.abs(grid[i][j] - base) / x;
            }
        }

        return ret;
    }
}