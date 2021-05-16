// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Reshape the Matrix.
// Memory Usage: 40 MB, less than 47.54% of Java online submissions for Reshape the Matrix.
// .
// T:O(m * n), S:O(1) 或 O(m * n)
//
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length, col = mat[0].length;
        if (row * col != r * c) {
            return mat;
        }
        int[][] ret = new int[r][c];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int pos = i * col + (j + 1);
                int newRow = (pos - 1) / c, newCol = (pos - 1) % c;
                ret[newRow][newCol] = mat[i][j];
            }
        }
        return ret;
    }
}