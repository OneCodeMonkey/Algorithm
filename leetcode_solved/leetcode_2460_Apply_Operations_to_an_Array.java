// AC: Runtime 1 ms Beats 75% 
// Memory 44.5 MB Beats 25%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length, pos = 0;
        int[] ret = new int[len];
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
                if (nums[i] != 0) {
                    ret[pos++] = nums[i];
                }
                i++;
            } else if (nums[i] != 0) {
                ret[pos++] = nums[i];
            }
        }
        if (nums[len - 1] != 0) {
            ret[pos++] = nums[len - 1];
        }

        return ret;
    }
}
