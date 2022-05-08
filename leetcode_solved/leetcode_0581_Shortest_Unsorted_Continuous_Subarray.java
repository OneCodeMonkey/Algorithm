// AC: Runtime: 12 ms, faster than 25.31% of Java online submissions for Shortest Unsorted Continuous Subarray.
// Memory Usage: 53.4 MB, less than 71.03% of Java online submissions for Shortest Unsorted Continuous Subarray.
// copy an array an sort, compare with original array.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length, leftIndex = -1, rightIndex = -1;
        int[] copy = new int[len];
        System.arraycopy(nums, 0, copy, 0, len);
        Arrays.sort(copy);
        for (int i = 0; i < len; i++) {
            if (nums[i] != copy[i]) {
                leftIndex = i;
                break;
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] != copy[i]) {
                rightIndex = i;
                break;
            }
        }
        if (leftIndex == -1) {
            return 0;
        } else {
            return rightIndex - leftIndex + 1;
        }
    }
}