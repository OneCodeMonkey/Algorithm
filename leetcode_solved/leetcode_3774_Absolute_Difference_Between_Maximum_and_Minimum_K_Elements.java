// Runtime 5 ms Beats 100.00% 
// Memory 46.54 MB Beats 100.00%
// Sort.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length, sumMax = 0, sumMin = 0;
        for (int i = 0; i < k; i++) {
            sumMax += nums[len - 1 - i];
            sumMin += nums[i];
        }

        return sumMax - sumMin;
    }
}
