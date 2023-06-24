// AC: Runtime 22 ms Beats 100% 
// Memory 54.5 MB Beats 75.93%
// Greedy & sort.
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int findValueOfPartition(int[] nums) {
        int ret = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            ret = Math.min(ret, nums[i + 1] - nums[i]);
        }

        return ret;
    }
}
