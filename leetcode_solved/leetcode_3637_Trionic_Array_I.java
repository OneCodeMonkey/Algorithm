// Runtime 0 ms Beats 100.00% 
// Memory 44.57 MB Beats 81.51%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isTrionic(int[] nums) {
        int len = nums.length;
        if (len > 3) {
            if (nums[0] >= nums[1] || nums[len - 2] >= nums[len - 1]) {
                return false;
            }
            int peekCount = 0, valleyCount = 0;
            for (int i = 1; i < len - 1; i++) {
                if (nums[i - 1] == nums[i] || nums[i] == nums[i + 1]) {
                    return false;
                }
                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                    peekCount++;
                    if (peekCount > 1) {
                        return false;
                    }
                }
                if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                    valleyCount++;
                    if (valleyCount > 1) {
                        return false;
                    }
                }
            }

            return peekCount == 1 && valleyCount == 1;
        }

        return false;
    }
}
