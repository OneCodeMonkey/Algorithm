// Runtime 1 ms Beats 100.00%
// Memory 45.44 MB Beats 100.00%
// .
// T:O(m * n), S:O(m + n)
// 
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j += 2) {
                    ret.add(grid[i][j]);
                }
            } else {
                int start = col % 2 == 0 ? (col - 1) : (col - 2);
                for (int j = start; j >= 0; j -= 2) {
                    ret.add(grid[i][j]);
                }
            }
        }

        return ret;
    }
}
