// AC: Runtime: 58 ms, faster than 100.00% of Java online submissions for Find Triangular Sum of an Array.
// Memory Usage: 42.4 MB, less than 100.00% of Java online submissions for Find Triangular Sum of an Array.
// do as it says.
// T:O(n^2), S:O(1)
// 
class Solution {
    public int triangularSum(int[] nums) {
        int size = nums.length;
        while (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            size--;
        }

        return nums[0];
    }
}