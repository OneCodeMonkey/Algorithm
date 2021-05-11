// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
// Memory Usage: 39.1 MB, less than 75.50% of Java online submissions for Move Zeroes.
// 思路: 遇到0，和后面最先出现的非 0 位置进行 swap
// 复杂度：T:O(n), S:O(1)
// 
class Solution {
    public void moveZeroes(int[] nums) {
        // 记录当前循环下的第一个非0数位置
        int nonZeroPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nonZeroPos = Math.max(nonZeroPos, i + 1);
                if (nonZeroPos > nums.length - 1) {
                    continue;
                }
                // swap 后面的第一个非0数
                while (nums[nonZeroPos] == 0) {
                    nonZeroPos++;
                    if (nonZeroPos > nums.length - 1) {
                        break;
                    }
                }
                if (nonZeroPos < nums.length) {
                    swapElement(nums, i, nonZeroPos);
                }
            }
        }
    }

    private void swapElement(int[] nums, int i, int j) {
        if (i < 0 || j < 0 || i > nums.length - 1 || j > nums.length - 1) {
            throw new IndexOutOfBoundsException();
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}