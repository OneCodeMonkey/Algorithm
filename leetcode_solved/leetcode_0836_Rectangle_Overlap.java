// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Rectangle Overlap.
// Memory Usage: 35.8 MB, less than 98.52% of Java online submissions for Rectangle Overlap.
// see the notation.
// T:O(1), S:O(1)
// 
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x11 = rec1[0], y11 = rec1[1], x12 = rec1[2], y12 = rec1[3];
        int x21 = rec2[0], y21 = rec2[1], x22 = rec2[2], y22 = rec2[3];
        // become a line or point, return false
        if ((x11 == x12 || y11 == y12 || x21 == x22 || y21 == y22)) {
            return false;
        }
        // x-axios do not overlap
        if (x21 >= x12 || x11 >= x22) {
            return false;
        }

        // y-axios do not overlap
        if (y21 >= y12 || y11 >= y22) {
            return false;
        }

        return true;
    }
}