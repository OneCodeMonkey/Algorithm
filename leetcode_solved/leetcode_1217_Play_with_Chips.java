// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Cost to Move Chips to The Same Position.
// Memory Usage: 36.4 MB, less than 58.27% of Java online submissions for Minimum Cost to Move Chips to The Same Position.
// 略。
// T:O(n), S:O(1)
//
class Solution {
    public int minCostToMoveChips(int[] position) {
        int countOdd = 0, countEven = 0;
        for (int i: position) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return Math.min(countOdd, countEven);
    }
}