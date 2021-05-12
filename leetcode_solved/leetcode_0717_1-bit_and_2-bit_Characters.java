// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for 1-bit and 2-bit Characters.
// Memory Usage: 38 MB, less than 87.51% of Java online submissions for 1-bit and 2-bit Characters.
// 分类讨论
// 复杂度：T:O(n), S:O(1)
// 
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length <= 1) {
            return true;
        }
        if (bits[bits.length - 2] == 0) {
            return true;
        } else {
            if (bits.length == 2) {
                return false;
            }
            if (bits[bits.length - 3] == 0) {
                return false;
            } else {
                // 从倒数第一位开始，后面跟着的 1 有奇数个就 false
                int oneBitCount = 1, pos = bits.length - 3;
                while (pos >= 0 && bits[pos] == 1) {
                    oneBitCount++;
                    pos--;
                }
                if (oneBitCount % 2 == 1) {
                    return false;
                }
                return true;
            }
        }
    }
}