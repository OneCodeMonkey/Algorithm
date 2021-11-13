// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Smallest Index With Equal Value.
// Memory Usage: 39.3 MB, less than 66.67% of Java online submissions for Smallest Index With Equal Value.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }

        return -1;
    }
}