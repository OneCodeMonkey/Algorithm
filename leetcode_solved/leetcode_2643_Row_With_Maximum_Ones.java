// AC: Runtime 6 ms Beats 80% 
// Memory 44.4 MB Beats 40%
// .
// T:O(m * n), S:O(m)
// 
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = mat.length, col = mat[0].length, retRowIndex = -1, retRowCountOnes = -1;
        for (int i = 0; i < row; i++) {
            int countOnes = 0;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > retRowCountOnes) {
                retRowIndex = i;
                retRowCountOnes = countOnes;
            }
        }

        return new int[]{retRowIndex, retRowCountOnes};
    }
}
