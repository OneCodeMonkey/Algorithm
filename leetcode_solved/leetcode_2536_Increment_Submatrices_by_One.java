// AC: Runtime 22 ms Beats 100% 
// Memory 50.6 MB Beats 83.33%
// Range addition.
// T:O(n ^ 2 + n * k), S:O(n ^ 2)
// 
class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ret = new int[n][n];
        for (int[] query : queries) {
            int row1 = query[0], col1 = query[1], row2 = query[2], col2 = query[3];
            boolean isIn = col2 < n - 1;
            for (int i = row1; i <= row2; i++) {
                ret[i][col1]++;
                if (isIn) {
                    ret[i][col2 + 1]--;
                }
            }
        }
        for (int[] row : ret) {
            int curSum = 0;
            for (int i = 0; i < n; i++) {
                curSum += row[i];
                row[i] = curSum;
            }
        }

        return ret;
    }
}
