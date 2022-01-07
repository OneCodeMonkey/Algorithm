// AC: Runtime: 2 ms, faster than 99.96% of Java online submissions for Removing Minimum and Maximum From Array.
// Memory Usage: 57.6 MB, less than 83.95% of Java online submissions for Removing Minimum and Maximum From Array.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minimumDeletions(int[] nums) {
        int size = nums.length, maxVal = Integer.MIN_VALUE, maxIndex = -1, minVal = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < size; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxIndex = i;
            }
            if (nums[i] < minVal) {
                minVal = nums[i];
                minIndex = i;
            }
        }

        if (maxIndex >= minIndex) {
            return Math.min(Math.min(maxIndex + 1, size - minIndex), minIndex + 1 + size - maxIndex);
        } else {
            return Math.min(Math.min(minIndex + 1, size - maxIndex), maxIndex + 1 + size - minIndex);
        }
    }
}