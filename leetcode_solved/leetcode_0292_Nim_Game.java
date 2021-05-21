// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Nim Game.
// Memory Usage: 35.2 MB, less than 99.32% of Java online submissions for Nim Game.
// 如果 n 为 4 的倍数，则后手的每次只需拿走 4 - X 个即可,X 为上一回合对手拿走的数量。后手必赢
// 如果 n 不是 4 的倍数，则先手者第一次只需拿走 n % 4 个，即可造成对手为 4 的倍数，那么沿用上面的情形对手必输
// T:O(1), S:O(1)
// 
class Solution {
    public boolean canWinNim(int n) {
        if (n % 4 == 0) {
            return false;
        }
        return true;
    }
}