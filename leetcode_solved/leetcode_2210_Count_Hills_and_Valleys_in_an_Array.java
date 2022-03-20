// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Count Hills and Valleys in an Array.
// Memory Usage: 41.8 MB, less than 100.00% of Java online submissions for Count Hills and Valleys in an Array.
// brute O(n^2) way.
// T:O(n^2), S:O(1)
// 
class Solution {
    public int countHillValley(int[] nums) {
        int ret = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1]) {
                int j = i + 1;
                while (j < nums.length && nums[j] == nums[i]) {
                    j++;
                }
                if (j < nums.length && nums[j] < nums[i]) {
                    ret++;
                }
            }
            if (nums[i] < nums[i - 1]) {
                int j = i + 1;
                while (j < nums.length && nums[j] == nums[i]) {
                    j++;
                }
                if (j < nums.length && nums[j] > nums[i]) {
                    ret++;
                }
            }
        }

        return ret;
    }
}