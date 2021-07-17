// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Score After Flipping Matrix.
// Memory Usage: 36.5 MB, less than 95.04% of Java online submissions for Score After Flipping Matrix.
// Greedy: First is ensure the 0-index of every row is 1, then check the 2-th bit's 1-sum, if sum < col - sum, 
//      then reverse this column, and go ahead until the last column.
// T:O(row * col), S:O(1)
// 
class Solution {
    public int matrixScore(int[][] grid) {
        int row = grid.length, col = grid[0].length, ret = 0;
        ret += row * (1 << (col - 1));
        for (int i = 1; i < col; i++) {
            int temp = 0;
            for (int j = 0; j < row; j++) {
                temp += grid[j][i] == grid[j][0] ? 1 : 0;
            }
            ret += Math.max(temp, row - temp) * (1 << col - 1 - i);
        }

        return ret;
    }
}