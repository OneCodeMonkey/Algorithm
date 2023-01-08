// AC: Runtime 0 ms Beats 100% 
// Memory 42.2 MB Beats 100%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int maximumCount(int[] nums) {
        int posiCount = 0, negaCount = 0;
        for (int num : nums) {
            if (num > 0) {
                posiCount++;
            } else if (num < 0) {
                negaCount++;
            }
        }

        return Math.max(posiCount, negaCount);
    }
}