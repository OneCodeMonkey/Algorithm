// AC: Runtime: 3 ms, faster than 100.00% of Java online submissions for Minimum Difference Between Highest and Lowest of K Scores.
// Memory Usage: 38.8 MB, less than 100.00% of Java online submissions for Minimum Difference Between Highest and Lowest of K Scores.
// sort and compare nums[i + k - 1] - nums[i].
// T:O(nlogn), S:O(logn)
//
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int size = nums.length, ret = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < size - k + 1; i++) {
            ret = Math.min(ret, nums[i + k - 1] - nums[i]);
        }

        return ret;
    }
}