// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Transpose Matrix.
// Memory Usage: 39.7 MB, less than 74.72% of Java online submissions for Transpose Matrix.
// .
// T:O(m*n), S:O(1)
// 
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[][] ret = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ret[i][j] = matrix[j][i];
            }
        }
        
        return ret;
    }
}