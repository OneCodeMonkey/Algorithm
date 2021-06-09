// AC: Runtime: 7 ms, faster than 53.55% of Java online submissions for Largest Perimeter Triangle.
// Memory Usage: 39.5 MB, less than 76.71% of Java online submissions for Largest Perimeter Triangle.
// .
// T:O(nlogn), S:O(logn)
//
class Solution {
    public int largestPerimeter(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        for (int i = size - 1; i - 2 >= 0; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}