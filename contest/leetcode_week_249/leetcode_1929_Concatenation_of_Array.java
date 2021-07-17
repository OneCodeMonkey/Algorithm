// AC: Runtime: 2 ms, faster than 100.00% of Java online submissions for Concatenation of Array.
// Memory Usage: 47.7 MB, less than 100.00% of Java online submissions for Concatenation of Array.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ret = new int[2 * size];
        for (int i = 0; i < 2 * size; i++) {
            ret[i] = nums[i % size];
        }

        return ret;
    }
}
