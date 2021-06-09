// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Continuous Increasing Subsequence.
// Memory Usage: 40 MB, less than 21.02% of Java online submissions for Longest Continuous Increasing Subsequence.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int tempCount = 1, ret = 1, size = nums.length;
        
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                tempCount++;
                if (tempCount > ret) {
                    ret = tempCount;
                }
            } else {
                tempCount = 1;
            }
        }

        return ret;
    }
}
