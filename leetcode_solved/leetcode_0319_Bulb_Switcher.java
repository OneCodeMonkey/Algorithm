// AC:
// Runtime: 1265 ms, faster than 100.00% of Java online submissions for Bulb Switcher.
// Memory Usage: 35.3 MB, less than 90.80% of Java online submissions for Bulb Switcher.
// 思路：第 i 个灯泡，会被执行N 次转换，N 为能整除 i 的整数个数（包括1）。由于因子都是成对出现，
//      所以统计一个数的独立能整除数时候，平方数的统计结果会是奇数，非平方数是偶数。偶数则最终是灭的状态
//      只要统计 [1,...,n] 中有多少个平方数就是最终结果。
// 复杂度：T:O(n), S:O(1)
// 
class Solution {
    public int bulbSwitch(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            int sqrtI = (int)Math.sqrt((double)i);
            if (sqrtI * sqrtI == i) {
                ret++;
            }
        }
        return ret;
    }
}