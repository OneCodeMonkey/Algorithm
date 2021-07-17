// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove One Element to Make the Array Strictly Increasing.
// Memory Usage: 40.2 MB, less than 28.30% of Java online submissions for Remove One Element to Make the Array Strictly Increasing.
// analyze different cases when nums[i] <= nums[i - 1]
// T:O(n), S:O(1)
// 
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int previous = nums[0], size = nums.length;
        boolean removed = false;
        for (int i = 1; i < size; i++) {
            if (nums[i] <= previous) {
                if (removed) {
                    // has removed one element, cannot remove more.
                    return false;
                } else {
                    if (i == 1 || nums[i] > nums[i - 2]) {
                        // remove previous, go ahead
                        previous = nums[i];
                        removed = true;
                    } else {
                        // remove nums[i], remain previous.
                        removed = true;
                    }
                }
            } else {
                previous = nums[i];
            }
        }

        return true;
    }
}