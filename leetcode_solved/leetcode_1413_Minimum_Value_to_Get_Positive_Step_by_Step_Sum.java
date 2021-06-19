// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Value to Get Positive Step by Step Sum.
// Memory Usage: 36.5 MB, less than 40.08% of Java online submissions for Minimum Value to Get Positive Step by Step Sum.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE, tempSum = 0, size = nums.length;
        for (int i = 0; i < size; i++) {
            tempSum += nums[i];
            min = Math.min(min, tempSum);
        }
        
        return min > 0 ? 1 : 1 - min;
    }
}