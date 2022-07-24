// AC: Runtime: 64 ms, faster than 80.00% of Java online submissions for Equal Row and Column Pairs.
// Memory Usage: 67.9 MB, less than 60.00% of Java online submissions for Equal Row and Column Pairs.
// .
// T:O(n^3), S:O(1)
// 
class Solution {
    public int equalPairs(int[][] grid) {
        int len = grid.length, ret = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < len; j++) {
                boolean flag = true;
                for (int k = 0; k < len; k++) {
                    if (ints[k] != grid[k][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ret++;
                }
            }
        }

        return ret;
    }
}