// AC: Runtime 5 ms Beats 50% 
// Memory 54.7 MB Beats 25%
// brute-force
// T:O(m * n), S:O(1)
// 
class Solution {
    public int maxSum(int[][] grid) {
        int row = grid.length, col = grid[0].length, ret = 0, sum;
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] +
                        grid[i + 2][j + 1] + grid[i + 2][j + 2];
                ret = Math.max(ret, sum);
            }
        }

        return ret;
    }
}
