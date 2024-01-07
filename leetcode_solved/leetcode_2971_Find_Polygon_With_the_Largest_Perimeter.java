// AC: Runtime 38 ms Beats 5.92% of users with Java
// Memory 56.12 MB Beats 82.70% of users with Java
// Sort.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        long curSum = 0;
        for (int num : nums) {
            curSum += num;
        }
        for (int i = len - 1; i >= 2; i--) {
            if (nums[i] < curSum - nums[i]) {
                return curSum;
            }
            curSum -= nums[i];
        }

        return -1;
    }
}
