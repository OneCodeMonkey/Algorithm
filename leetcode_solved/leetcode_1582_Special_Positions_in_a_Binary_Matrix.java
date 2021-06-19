// AC: Runtime: 1 ms, faster than 99.65% of Java online submissions for Special Positions in a Binary Matrix.
// Memory Usage: 38.9 MB, less than 78.01% of Java online submissions for Special Positions in a Binary Matrix.
// .
// T:O(row * col * row), S:O(1)
// 
class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length, col = mat[0].length, ret = 0;
        for (int i = 0; i < row; i++) {
            int oneCount = 0, onePos = -1;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    oneCount++;
                    onePos = j;
                    if (oneCount > 1) {
                        break;
                    }
                }
            }
            if (oneCount == 1) {
                boolean flag = true;
                for (int k = 0; k < row; k++) {
                    if (k == i) {
                        continue;
                    }
                    if (mat[k][onePos] != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ret++;
                }
            }
        }
        
        return ret;
    }
}