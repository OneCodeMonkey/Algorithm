// AC: Runtime: 48 ms, faster than 66.67% of Java online submissions for Check if Every Row and Column Contains All Numbers.
// Memory Usage: 107 MB, less than 33.33% of Java online submissions for Check if Every Row and Column Contains All Numbers.
// .
// T:O(m * n), S:O(max(m, n))
// 
class Solution {
    public boolean checkValid(int[][] matrix) {
        int row = matrix.length;
        HashSet<Integer> record = new HashSet<>();
        for (int i = 0; i < row; i++) {
            record.clear();
            for (int j: matrix[i]) {
                if (j > 0 && j <= row) {
                    record.add(j);
                }
            }
            if (record.size() < row) {
                return false;
            }
            record.clear();
            for (int[] ints : matrix) {
                if (ints[i] > 0 && ints[i] <= row) {
                    record.add(ints[i]);
                }
            }
            if (record.size() < row) {
                return false;
            }
        }

        return true;
    }
}