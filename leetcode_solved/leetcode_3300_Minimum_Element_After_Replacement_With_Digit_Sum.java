// Runtime 1 ms Beats 100.00%
// Memory 43.40 MB Beats 100.00%
// .
// T:O(nlogk), S:O(1), k is the number range.
// 
class Solution {
    public int minElement(int[] nums) {
        int ret = Integer.MAX_VALUE;
        for (int num : nums) {
            ret = Math.min(ret, getDigit(num));
        }

        return ret;
    }

    private int getDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
