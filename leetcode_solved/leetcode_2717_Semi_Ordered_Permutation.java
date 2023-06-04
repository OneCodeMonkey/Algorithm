// AC: Runtime 2 ms Beats 100% 
// Memory 43.3 MB Beats 20%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int pos1 = -1, posN = -1, ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                pos1 = i;
            }
            if (nums[i] == nums.length) {
                posN = i;
            }
        }
        ret = pos1 < posN ? (pos1 + nums.length - 1 - posN) : (pos1 + nums.length - 1 - posN - 1);

        return ret;
    }
}
