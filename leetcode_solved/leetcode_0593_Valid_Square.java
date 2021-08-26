// AC: Runtime: 1 ms, faster than 86.72% of Java online submissions for Valid Square.
// Memory Usage: 36.5 MB, less than 93.80% of Java online submissions for Valid Square.
// .
// T:O(1), S:O(1)
//
class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        long[] disSquare = new long[6];
        disSquare[0] = (p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) * (p2[1] - p1[1]);
        disSquare[1] = (p3[0] - p1[0]) * (p3[0] - p1[0]) + (p3[1] - p1[1]) * (p3[1] - p1[1]);
        disSquare[2] = (p4[0] - p1[0]) * (p4[0] - p1[0]) + (p4[1] - p1[1]) * (p4[1] - p1[1]);
        disSquare[3] = (p3[0] - p2[0]) * (p3[0] - p2[0]) + (p3[1] - p2[1]) * (p3[1] - p2[1]);
        disSquare[4] = (p4[0] - p2[0]) * (p4[0] - p2[0]) + (p4[1] - p2[1]) * (p4[1] - p2[1]);
        disSquare[5] = (p4[0] - p3[0]) * (p4[0] - p3[0]) + (p4[1] - p3[1]) * (p4[1] - p3[1]);

        // no same point.
        for (int i = 0; i < 6; i++) {
            if (disSquare[i] == 0) {
                return false;
            }
        }
        Arrays.sort(disSquare);
        // four edge equal
        for (int i = 1; i <= 3; i++) {
            if (disSquare[i] != disSquare[0]) {
                return false;
            }
        }
        // diagonal's square is sum of two adjacent edge's square.
        for (int i = 4; i < 6; i++) {
            if (disSquare[i] != 2 * disSquare[0]) {
                return false;
            }
        }

        return true;
    }
}