// AC: Runtime: 1 ms, faster than 92.31% of Java online submissions for Find Subarrays With Equal Sum.
// Memory Usage: 40 MB, less than 100.00% of Java online submissions for Find Subarrays With Equal Sum.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> sumRecord = new HashSet<>();
        int curSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curSum += nums[i];
            if (sumRecord.contains(curSum)) {
                return true;
            }
            sumRecord.add(curSum);
            curSum -= nums[i - 1];
        }

        return false;
    }
}
