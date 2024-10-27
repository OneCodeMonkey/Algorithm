// Runtime 2 ms Beats 92.44%
// Memory 45.00 MB Beats 13.50%
// Brute-force.
// T:O(n * k), S:O(1)
// 
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len = nums.size(), pos = 0;
        int[] ret = new int[len];
        for (int num : nums) {
            if (num % 2 == 0) {
                ret[pos++] = -1;
            } else {
                for (int i = num / 2; i <= num - 1; i++) {
                    if ((i | (i + 1)) == num) {
                        ret[pos++] = i;
                        break;
                    }
                }
            }
        }

        return ret;
    }
}
