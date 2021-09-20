// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Middle Index in Array.
// Memory Usage: 38.2 MB, less than 91.66% of Java online submissions for Find the Middle Index in Array.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int findMiddleIndex(int[] nums) {
        int size = nums.length, sum = 0, tempSum = 0;
        for (int i: nums) {
            sum += i;
        }
        for (int i = 0; i < size; i++) {
            tempSum += nums[i];
            int leftSum = tempSum - nums[i], rightSum = sum - tempSum;
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}