// AC: Runtime: 2 ms, faster than 38.15% of Java online submissions for Sort Array By Parity.
// Memory Usage: 48 MB, less than 65.48% of Java online submissions for Sort Array By Parity.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ret = new int[nums.length];
        int pos = 0, pos2 = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ret[pos++] = num;
            } else {
                ret[pos2--] = num;
            }
        }

        return ret;
    }
}