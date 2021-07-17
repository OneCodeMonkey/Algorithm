// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Build Array from Permutation.
// Memory Usage: 39.3 MB, less than 91.97% of Java online submissions for Build Array from Permutation.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] ret = new int[size];

        for (int i = 0; i < size; i++) {
            ret[i] = nums[nums[i]];
        }

        return ret;
    }
}