// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Divisor Game.
// Memory Usage: 35 MB, less than 99.69% of Java online submissions for Divisor Game.
// 思路：简单归纳一下即可。
//      因为 n = 2 先手必赢，n = 3 先手必输。 n > 2 时:
//      1. 假设现在 n 为偶数, A 知道 n - 1 为奇数的情况下先手必输，所以只取走 1，那么剩下 n - 1 为奇数，B 必输，则 A 必赢。
//      2. 假设现在 n 为奇数，A 先手只能减去一个奇数因子（奇数因子不会为偶数）或1，不管减什么都会留给B偶数，偶数下 B 必赢，A 必输
// 
class Solution {
    public boolean divisorGame(int n) {
        if (n % 2 == 0) {
        	return true;
        }
        return false;
    }
}