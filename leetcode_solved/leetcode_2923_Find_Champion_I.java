// AC: Runtime Details 1ms Beats 100.00%of users with Java
// Memory Details 43.93MB Beats 50.00%of users with Java
// .
// T:O(n ^ 2), S:O(1)
// 
class Solution {
    public int findChampion(int[][] grid) {
        int len = grid.length, sum = 0;
        for (int[] row : grid) {
            sum = 0;
            for (int val : row) {
                sum += val;
            }
            if (sum == len - 1) {
                for (int i = 0; i < len; i++) {
                    if (row[i] == 0) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }
}
