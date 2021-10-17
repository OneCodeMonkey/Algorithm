// AC: Runtime: 34 ms, faster than 75.00% of Java online submissions for Number of Pairs of Strings With Concatenation Equal to Target.
// Memory Usage: 51.7 MB, less than 87.50% of Java online submissions for Number of Pairs of Strings With Concatenation Equal to Target.
// .
// T:O(n^2 * len(target)), S:O(max(len(target), nums[i] + nums[j])
//
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ret = 0, size = nums.length;
        for (int i = 0; i < size; i++) {
            if (!target.contains(nums[i])) {
                continue;
            }
            for (int j = i + 1; j < size; j++) {
                if (nums[j].length() != target.length() - nums[i].length()) {
                    continue;
                }
                if (target.equals(nums[i] + nums[j])) {
                    ret++;
                }
                if (target.equals(nums[j] + nums[i])) {
                    ret++;
                }
            }
        }

        return ret;
    }
}