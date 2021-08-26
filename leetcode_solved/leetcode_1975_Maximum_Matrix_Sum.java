// AC: Runtime: 6 ms, faster than 100.00% of Java online submissions for Maximum Matrix Sum.
// Memory Usage: 48.1 MB, less than 100.00% of Java online submissions for Maximum Matrix Sum.
// if have zero, then sum all absolute value. if not zero and negative numbers are odd, then sum all absolute and minus 2 * maxNegativeNumber.
// T:O(m * n), S:O(1)
// 
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int minAbs = Integer.MAX_VALUE, negaCount = 0;
        long absSum = 0;
        boolean hasZero = false;
        int row = matrix.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (!hasZero && matrix[i][j] == 0) {
                    hasZero = true;
                }
                absSum += Math.abs(matrix[i][j]);
                if (!hasZero) {
                    minAbs = Math.min(minAbs, Math.abs(matrix[i][j]));
                    if (matrix[i][j] < 0) {
                        negaCount++;
                    }
                }
            }
        }

        if (hasZero || (negaCount % 2 == 0)) {
            return absSum;
        } else {
            return absSum - 2L * minAbs;
        }
    }
}
