// AC：
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
// Memory Usage: 35.9 MB, less than 69.24% of Java online submissions for Add Digits.
// 注意小于10 的直接 return，不要忽略特殊情况
// 复杂度:T:O(log10(n)), S:O(1)
//
class Solution {
    public int addDigits(int num) {
        // 踩坑
        if (num < 10) {
            return num;
        }
        int sumOfBit = 0;
        while (num >= 10) {
            sumOfBit = 0;
            while (num > 0) {
                sumOfBit += num % 10;
                num /= 10;
            }
            num = sumOfBit;
        }
        return sumOfBit;
    }
}