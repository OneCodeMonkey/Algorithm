// Runtime 1 ms Beats 100.00% of users with Java
// Memory 45.32 MB Beats 80.24% of users with Java
// .
// T:O(m * n), S:O(n)
// 
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[] colMax = new int[col];
        for (int i = 0; i < col; i++) {
            int colMaxElem = Integer.MIN_VALUE;
            for (int[] ints : matrix) {
                colMaxElem = Math.max(colMaxElem, ints[i]);
            }
            colMax[i] = colMaxElem;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = colMax[j];
                }
            }
        }

        return matrix;
    }
}
