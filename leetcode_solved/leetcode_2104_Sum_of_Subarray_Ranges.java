// Solution 1: O(n^2)
// AC: Runtime: 26 ms, faster than 44.73% of Java online submissions for Sum of Subarray Ranges.
// Memory Usage: 45.1 MB, less than 17.13% of Java online submissions for Sum of Subarray Ranges.
// .
// T:O(n^2), S:O(n)
//
class Solution {
    public long subArrayRanges(int[] nums) {
        int size = nums.length;
        long ret = 0;
        for (int i = 0; i < size; i++) {
            int max = nums[i], min = nums[i];
            for (int j = i + 1; j < size; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                ret += max - min;
            }
        }

        return ret;
    }
}

// Solution 2: increasing Stack, O(n)
// 