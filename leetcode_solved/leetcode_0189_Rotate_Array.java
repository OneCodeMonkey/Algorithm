// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
// Memory Usage: 56.2 MB, less than 55.69% of Java online submissions for Rotate Array.
// a reverse trick, to remember.
// T:O(n), S:O(1)
// 
class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        reverse(nums, 0, size - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, size - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}