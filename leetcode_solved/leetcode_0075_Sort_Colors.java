// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
// Memory Usage: 37.2 MB, less than 93.91% of Java online submissions for Sort Colors.
// two-loop bubble up.
// T:avg:O(n^2),min:O(n), S:O(1)
// 
class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length, lastTwoIndex = -1;
        // 冒泡 2
        for (int i = size - 1; i >= 0; i--) {
            if (nums[i] != 2) {
                boolean hasTwo = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] == 2) {
                        hasTwo = true;
                        swap(nums, i, j);
                        lastTwoIndex = i;
                        break;
                    }
                }
                // 提前终止
                if (!hasTwo) {
                    break;
                }
            } else {
                lastTwoIndex = i;
            }
        }

        // 冒泡 1
        int endIndex = size - 1;
        if (lastTwoIndex != -1) {
            endIndex = lastTwoIndex - 1;
        }
        for (int i = endIndex; i >= 0; i--) {
            if (nums[i] != 1) {
                boolean hasOne = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] == 1) {
                        hasOne = true;
                        swap(nums, i, j);
                        break;
                    }
                }
                if (!hasOne) {
                    break;
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}