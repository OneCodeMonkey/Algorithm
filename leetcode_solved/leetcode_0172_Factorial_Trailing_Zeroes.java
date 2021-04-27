// AC:
// Runtime: 5 ms, faster than 13.00% of Java online submissions for Factorial Trailing Zeroes.
// Memory Usage: 36.2 MB, less than 11.71% of Java online submissions for Factorial Trailing Zeroes.
//
class Solution {
    public int trailingZeroes(int n) {
        int ret = 0;
        if (n < 5) {
            return ret;
        }
        int maxFivePlus = 5 * (n / 5);
        for (int i = 5; i <= maxFivePlus; i += 5) {
            ret += getFiveDividerCount(i);
        }

        return ret;
    }

    // 找出因式分解结果中5的个数
    private int getFiveDividerCount(int num) {
        int fiveDividerCount = 0;
        while (num > 0) {
            if (num % 5 == 0) {
                num /= 5;
                fiveDividerCount++;
            } else {
                break;
            }
        }
        return fiveDividerCount;
    }
}