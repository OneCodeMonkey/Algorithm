// AC: Runtime: 2 ms, faster than 15.74% of Java online submissions for Monotonic Array.
// Memory Usage: 47.9 MB, less than 9.88% of Java online submissions for Monotonic Array.
// .
// T:O(n), S:O(1)
//
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean asc = true, desc = true;
        for (int i = 1; i < nums.length; i++) {
            asc &= nums[i] >= nums[i - 1];
            desc &= nums[i] <= nums[i - 1];
        }
        return asc || desc;
    }
}