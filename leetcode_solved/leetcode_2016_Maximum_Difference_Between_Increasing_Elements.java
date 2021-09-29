// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Difference Between Increasing Elements.
// Memory Usage: 38.2 MB, less than 100.00% of Java online submissions for Maximum Difference Between Increasing Elements.
// .
// T:O(n), S:O(n)
//
class Solution {
    public int maximumDifference(int[] nums) {
        int size = nums.length;
        int min = Integer.MAX_VALUE;
        int[] leftMin = new int[size];
        leftMin[0] = nums[0];
        for (int i = 1; i < size; i++) {
            min = Math.min(min, nums[i - 1]);
            leftMin[i] = min;
        }

        int ret = Integer.MIN_VALUE;
        boolean exist = false;
        for (int i = 1; i < size; i++) {
            if (nums[i] <= leftMin[i]) {
                continue;
            }
            if (!exist) {
                exist = true;
            }
            ret = Math.max(ret, nums[i] - leftMin[i]);
        }

        return exist ? ret : -1;
    }
}