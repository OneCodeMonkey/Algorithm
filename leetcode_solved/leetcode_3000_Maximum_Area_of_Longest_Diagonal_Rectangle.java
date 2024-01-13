// AC: Runtime 1 ms Beats 99.84% of users with Java
// Memory 44.00 MB Beats 97.27% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0, maxEdgeSquare = 0;
        for (int[] arr : dimensions) {
            int a = arr[0], b = arr[1], square = a * a + b * b;
            if (square > maxEdgeSquare) {
                maxArea = a * b;
                maxEdgeSquare = square;
            } else if (square == maxEdgeSquare) {
                maxArea = Math.max(maxArea, a * b);
            }
        }

        return maxArea;
    }
}
