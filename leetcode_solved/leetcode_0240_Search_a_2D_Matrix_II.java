// Solution 1: binary search of every row(or column)
// AC: Runtime: 5 ms, faster than 49.82% of Java online submissions for Search a 2D Matrix II.
// Memory Usage: 45 MB, less than 23.65% of Java online submissions for Search a 2D Matrix II.
// binary search, but not use the row and column both ordered condition, so there are better solution
// T:O(row * log(col)), S:O(log(col))
//
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;

        for (int[] ints : matrix) {
            if (Arrays.binarySearch(ints, target) >= 0) {
                return true;
            }
        }

        return false;
    }
}

// Solution 2: search from top-right, move left or down to search
// AC: Runtime: 4 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix II.
// Memory Usage: 44.5 MB, less than 78.90% of Java online submissions for Search a 2D Matrix II.
// two-direction move, see the annotation
// T:O(row + col), S:O(1)
//
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int rowPos = 0, colPos = col - 1;
        while (matrix[rowPos][colPos] != target) {
            // left move for one column
            if (matrix[rowPos][colPos] > target) {
                colPos--;
                if (colPos < 0) {
                    return false;
                }
            } 
            // down move for one row
            else {
                rowPos++;
                if (rowPos >= row) {
                    return false;
                }
            }
        }

        // cannot remove, check the final position is target or not.
        return matrix[rowPos][colPos] == target;
    }
}