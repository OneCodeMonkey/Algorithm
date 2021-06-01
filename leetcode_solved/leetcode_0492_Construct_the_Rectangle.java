// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Construct the Rectangle.
// Memory Usage: 36.2 MB, less than 83.12% of Java online submissions for Construct the Rectangle.
// travel from the sqrt(n), when area is odd, then start from largest odd below sqrt(n) and step = 2
// T:O(sqrt(n)), S:O(1)
//
class Solution {
    public int[] constructRectangle(int area) {
        int sqrtA = (int)Math.floor(Math.sqrt(area)), start = sqrtA, step = 1;
        int[] ret = new int[2];
        if (area % 2 == 1) {
            if (start % 2 == 0) {
                start -= 1;
            }
            step = 2;
        }
        while (true) {
            if (area % start == 0) {
                ret[0] = area/start;
                ret[1] = start;
                break;
            }
            start -= step;
//            if (start < 1) {
//                break;
//            }
        }

        return ret;
    }
}