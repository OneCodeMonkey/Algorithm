// Runtime 2 ms Beats 100.00%
// Memory 43.21 MB Beats 100.00%
// Sort.
// T:O(nlogn), S:O(1)
// 
class Solution {
    public double minimumAverage(int[] nums) {
        double ret = Double.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            ret = Math.min(ret, (nums[i] + nums[nums.length - 1 - i]) * 1.0 / 2);
        }

        return ret;
    }
}
