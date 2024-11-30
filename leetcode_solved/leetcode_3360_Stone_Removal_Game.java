// Runtime 0 ms Beats 100.00%
// Memory 40.76 MB Beats 50.00%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public boolean canAliceWin(int n) {
        int turn = 0, cur = 10;
        while (n > 0) {
            if (n < cur) {
                return cur % 2 != 0;
            }
            n -= cur;
            cur--;
        }

        if (n == 0) {
            return cur % 2 != 0;
        }

        return true;
    }
}
