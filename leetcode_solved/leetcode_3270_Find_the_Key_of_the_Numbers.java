// Runtime 1 ms Beats 100.00%
// Memory 40.91 MB Beats 100.00%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ret = 0, base = 1;
        while (num1 > 0 || num2 > 0 || num3 > 0) {
            int digit1 = num1 > 0 ? num1 % 10 : 0, digit2 = num2 > 0 ? num2 % 10 : 0, digit3 = num3 > 0 ? num3 % 10 : 0;
            ret += Math.min(digit1, Math.min(digit2, digit3)) * base;
            base *= 10;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }

        return ret;
    }
}
