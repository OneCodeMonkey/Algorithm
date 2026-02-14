// Runtime 1 ms Beats 99.32% 
// Memory 120.43 MB Beats 21.99%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int incrSuffixCount = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                incrSuffixCount++;
            } else {
                break;
            }
        }

        return nums.length - incrSuffixCount;
    }
}
