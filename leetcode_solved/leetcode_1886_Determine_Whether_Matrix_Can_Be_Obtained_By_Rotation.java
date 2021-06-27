// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Determine Whether Matrix Can Be Obtained By Rotation.
// Memory Usage: 38 MB, less than 95.18% of Java online submissions for Determine Whether Matrix Can Be Obtained By Rotation.
// .
// T:O(m * n), S:O(1)
// 
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int size = mat.length;
        if (Arrays.deepEquals(mat, target)) {
            return true;
        }
        // check whether rotate clockwise 90°
        boolean rotate90 = true, rotate180 = true, rotate270 = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat[i][j] != target[j][size - 1 - i]) {
                    rotate90 = false;
                    break;
                }
            }
        }
        if (rotate90) {
            return true;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat[i][j] != target[size - 1 - i][size - 1 - j]) {
                    rotate180 = false;
                    break;
                }
            }
        }
        if (rotate180) {
            return true;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat[i][j] != target[size - 1 - j][i]) {
                    rotate270 = false;
                    break;
                }
            }
        }
        if (rotate270) {
            return true;
        }

        return false;
    }
}