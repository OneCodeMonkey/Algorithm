// AC: Runtime: 4 ms, faster than 100.00% of Java online submissions for Sum of Beauty in the Array.
// Memory Usage: 55.5 MB, less than 83.33% of Java online submissions for Sum of Beauty in the Array.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int sumOfBeauties(int[] nums) {
        int size = nums.length, ret = 0;
        int[] leftMax = new int[size], rightMin = new int[size];
        int curLeftMax = nums[0];
        for (int i = 1; i < size; i++) {
            leftMax[i] = curLeftMax;
            if (nums[i] > curLeftMax) {
                curLeftMax = nums[i];
            }
        }
        int curRightMin = nums[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMin[i] = curRightMin;
            if (nums[i] < curRightMin) {
                curRightMin = nums[i];
            }
        }

        for (int i = 1; i < size - 1; i++) {
            if (nums[i] > leftMax[i] && nums[i] < rightMin[i]) {
                ret += 2;
            } else if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                ret += 1;
            }
        }

        return ret;
    }
}