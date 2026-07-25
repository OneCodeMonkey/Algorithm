// Runtime 3 ms Beats 61.75% 
// Memory 48.39 MB Beats 74.75%
// .
// T:O(m * n), S:O(n)
// 
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length, col = matrix[0].length;
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            int deg = 0;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    deg++;
                }
            }
            ret[i] = deg;
        }

        return ret;
    }
}
