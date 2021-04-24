// AC:
// Runtime: 1 ms, faster than 93.26% of Java online submissions for Find Numbers with Even Number of Digits.
// Memory Usage: 38.8 MB, less than 28.15% of Java online submissions for Find Numbers with Even Number of Digits.
// 略。
class Solution {
    public int findNumbers(int[] nums) {
        int ret = 0;
        for (int i: nums) {
            if (getDigits(i) % 2 == 0) {
                ret++;
            }
        }
        return ret;
    }

    private int getDigits(int num) {
        if (num < 0) {
            num = -num;
        }
        int digit = 0;
        while (num > 0) {
            num /= 10;
            digit++;
        }
        return digit;
    }
}