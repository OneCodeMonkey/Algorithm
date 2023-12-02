// AC: Runtime 1 ms Beats 100.00% of users with Java
// Memory 43.58 MB Beats 33.33% of users with Java
// Compare row by row.
// T:O(m * n), S:O(1)
// 
class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        boolean ret = true;
        int row = mat.length, col = mat[0].length;
        k = k % col;
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                // left shift
                for (int j = 0; j < col; j++) {
                    int idx = j >= k ? (j - k) : (col + j - k);
                    if (mat[i][j] != mat[i][idx]) {
                        ret = false;
                        break;
                    }
                }
            } else {
                // right shift
                for (int j = 0; j < col; j++) {
                    int idx = j + k < col ? (j + k) : (j + k - col);
                    if (mat[i][j] != mat[i][idx]) {
                        ret = false;
                        break;
                    }
                }
            }
            if (!ret) {
                break;
            }
        }

        return ret;
    }
}
