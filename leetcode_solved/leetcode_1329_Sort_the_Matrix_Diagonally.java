// AC: Runtime: 7 ms, faster than 65.01% of Java online submissions for Sort the Matrix Diagonally.
// Memory Usage: 40.1 MB, less than 41.57% of Java online submissions for Sort the Matrix Diagonally.
// .
// T:O(row * col * log(col) + col * row * log*row), S:O(max(row, col))
// 
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length, col = mat[0].length;
        int startRow = 0;
        for (int i = 0; i < col; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j + startRow < row && i + j < col; j++) {
                temp.add(mat[startRow + j][i + j]);
            }
            Collections.sort(temp);
            int pos = 0;
            for (int j = 0; j + startRow < row && i + j < col; j++) {
                mat[startRow + j][i + j] = temp.get(pos++);
            }
        }

        int startCol = 0;
        for (int i = 0; i < row; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j + startCol < col && i + j < row; j++) {
                temp.add(mat[i + j][j + startCol]);
            }
            Collections.sort(temp);
            int pos = 0;
            for (int j = 0; j + startCol < col && i + j < row; j++) {
                mat[i + j][j + startCol] = temp.get(pos++);
            }
        }
        
        return mat;
    }
}