// AC: Runtime 8 ms Beats 100%
// Memory 43.7 MB Beats 33.33%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
            minVal = Math.min(minVal, num);
        }
        for (int num : nums) {
            if (num != maxVal && num != minVal) {
                return num;
            }
        }
        return -1;
    }
}
