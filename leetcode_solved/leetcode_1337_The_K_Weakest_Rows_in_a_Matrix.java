// AC:
// Runtime: 2 ms, faster than 59.41% of Java online submissions for The K Weakest Rows in a Matrix.
// Memory Usage: 39.7 MB, less than 80.04% of Java online submissions for The K Weakest Rows in a Matrix.
// 略。
// T:O(n), S:O(mat.length)
// 
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] record = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j: mat[i]) {
                if (j == 1) {
                    count++;
                } else {
                    break;
                }
            }
            record[i] = new int[]{i, count};
        }
        Arrays.sort(record, (a, b) -> (a[1] - b[1]));
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = record[i][0];
        }
        return ret;
    }
}