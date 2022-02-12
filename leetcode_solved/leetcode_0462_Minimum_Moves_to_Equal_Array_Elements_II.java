// AC: Runtime: 6 ms, faster than 41.56% of Java online submissions for Minimum Moves to Equal Array Elements II.
// Memory Usage: 44.9 MB, less than 16.73% of Java online submissions for Minimum Moves to Equal Array Elements II.
// find median and make final elements equal to median, that is least cost.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2], ret = 0;
        for (int i:nums) {
            ret += Math.abs(i - median);
        }
        return ret;
    }
}