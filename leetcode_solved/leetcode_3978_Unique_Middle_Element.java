// Runtime 1 ms Beats 94.88% 
// Memory 46.44 MB Beats 52.73%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i == len / 2) {
                continue;
            }
            if (nums[i] == nums[len / 2]) {
                return false;
            }
        }

        return true;
    }
}
