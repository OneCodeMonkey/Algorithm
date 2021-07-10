// AC: Runtime: 2 ms, faster than 100.00% of Java online submissions for Rectangle Area.
// Memory Usage: 38.1 MB, less than 88.56% of Java online submissions for Rectangle Area.
// Depart into several situations and analyse respectively, and we can get the regularity about the overlapped area.
// T:O(1), S:O(1)
// 
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int overlapArea, sumArea = (ay2 - ay1) * (ax2 - ax1) + (by2 - by1) * (bx2 - bx1);
        
        // no-overlapping area.
        if (bx1 >= ax2 || bx2 <= ax1 || by1 >= ay2 || by2 <= ay1) {
            overlapArea = 0;
        } else {
            // the overlapped area
            overlapArea = (Math.min(bx2, ax2) - Math.max(bx1, ax1)) * (Math.min(by2, ay2) - Math.max(by1, ay1));
        }
        
        return sumArea - overlapArea;
    }
}