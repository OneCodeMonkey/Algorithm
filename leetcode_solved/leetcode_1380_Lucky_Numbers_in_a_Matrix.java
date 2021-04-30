// AC:
// Runtime: 2 ms, faster than 68.59% of Java online submissions for Lucky Numbers in a Matrix.
// Memory Usage: 39.3 MB, less than 79.21% of Java online submissions for Lucky Numbers in a Matrix.
// 复杂度：T：O(n^2), S:O(n)
// 
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length, col = matrix[0].length, temp = 0;
        List<Integer> rowMin = new ArrayList<>();
        List<Integer> colMax = new ArrayList<>();
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            temp = matrix[i][0];
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < temp) {
                    temp = matrix[i][j];
                }
            }
            rowMin.add(temp);
        }
        for (int j = 0; j < col; j++) {
            temp = 0;
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] > temp) {
                    temp = matrix[i][j];
                }
            }
            colMax.add(temp);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == rowMin.get(i) && matrix[i][j] == colMax.get(j)) {
                    ret.add(matrix[i][j]);
                }
            }
        }

        return ret;
    }
}