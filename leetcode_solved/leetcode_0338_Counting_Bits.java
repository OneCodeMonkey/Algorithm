// 方法一，直接遍历 count bit 1
// Runtime: 9 ms, faster than 11.83% of Java online submissions for Counting Bits.
// Memory Usage: 43.1 MB, less than 46.93% of Java online submissions for Counting Bits.
// 略。
// T:O(n * log2M), S:(n), M 为 num
//
class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            ret[i] = countBit(i);
        }
        return ret;
    }
    private int countBit(int num) {
        int ret = 0;
        if (num < 1) {
            return ret;
        }
        while (num > 0) {
            if (num % 2 == 1) {
                ret++;
            }
            num = num >> 1;
        }
        return ret;
    }
}

// 方法二，减少重复计算。利用 ret[i] = ret[i / 2] + i % 2，可以重复利用前面的结果
// Runtime: 1 ms, faster than 99.75% of Java online submissions for Counting Bits.
// Memory Usage: 43 MB, less than 58.99% of Java online submissions for Counting Bits.
// 略。
// 复杂度：T:O(n), S:O(n)
//
class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            ret[i] = ret[i >> 1] + (i & 1);
        }
        return ret;
    }
}