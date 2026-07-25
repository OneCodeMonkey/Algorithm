// Runtime 4 ms Beats 98.14% 
// Memory 47.22 MB Beats 7.73%
// .
// T:O(nlogk), S:O(1)
// 
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ret = 0;
        for (int i : nums) {
            while (i > 0) {
                if (i % 10 == digit) {
                    ret++;
                }
                i /= 10;
            }
        }

        return ret;
    }
}
