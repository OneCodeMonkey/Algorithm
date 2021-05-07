// AC: 
// Runtime: 7 ms, Runtime: 6 ms, faster than 53.10% of Java online submissions for Bulb Switcher IV.
// Memory Usage: 39.4 MB, less than 56.32% of Java online submissions for Bulb Switcher IV.
// 思路：观察规律可以看到只与有多少个连续的 0 或 1 的片段数有关，头和尾各自开始的 0 片段不增加计数。
// 复杂度：T:O(n), S:O(1)
//
class Solution {
    public int minFlips(String target) {
        int ret = 0;

        boolean firstZero = false;
        for (int i = 0; i < target.length(); i++) {
            // 过滤头部的 '0'
            if (!firstZero) {
                if (target.charAt(i) == '1') {
                    firstZero = true;
                    ret++;
                }
            } else {    // 从首次出现 '1' 的后一位开始处理，每次出现一串连续的 0 或连续的 1，都会增加一次变化需要的次数
                if (target.charAt(i) != target.charAt(i - 1)) {
                    ret++;
                }
            }
        }

        return ret;
    }
}