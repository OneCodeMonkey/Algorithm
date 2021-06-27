// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Moving Stones Until Consecutive.
// Memory Usage: 37.1 MB, less than 21.00% of Java online submissions for Moving Stones Until Consecutive.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c), min = Math.min(Math.min(a, b), c), mid = a + b + c - max - min;
        int[] ret = new int[2];
        ret[1] = max - min - 2;
        if (max - mid == 1 && mid - min == 1) {
        } else if (max - mid <= 2 || mid - min <= 2) {
            ret[0] = 1;
        } else {
            ret[0] = 2;
        }

        return ret;
    }
}